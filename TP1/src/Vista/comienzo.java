package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import Controlador.BDAfrica;
import Controlador.BDAmericaDelNorte;
import Controlador.BDAmericaDelSur;
import Controlador.BDAsia;
import Controlador.BDEuropa;
import Controlador.BDOceania;
import Controlador.HerramientasInterface;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class comienzo {

	private JFrame Pantalla=new JFrame();
	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel Imagen=new JLabel();
	private JLabel Imagen2=new JLabel();
	private JLabel texto;
	private JButton Boton=new JButton();
	private BDOceania oceania=new BDOceania();
	private BDAmericaDelSur SurAmerica=new BDAmericaDelSur();
	private BDAmericaDelNorte NorteAmerica=new BDAmericaDelNorte();
	private BDEuropa Europaa=new BDEuropa();
	private BDAsia asiaa=new BDAsia();
	private BDAfrica Africaa=new BDAfrica();
	private Clip sonidos;
	
	
	
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comienzo window = new comienzo();
					window.Pantalla.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public comienzo() {
		initialize();
	}

	
	private void initialize() {
		
		//PANTALLA DE INICIO
		Pantalla.getContentPane().setBackground(Color.YELLOW); 
		Pantalla.setBounds(100, 100, 600, 600);
		Pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pantalla.getContentPane().setLayout(null);
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		herramientas.CargarImagen(Imagen,"imagenes\\akin4-soportecnicoweb[1].jpg",-27, 11, 611, 374, Pantalla); 
		JButton botonJugar=new JButton("Jugar");
		JButton historia=new JButton("Historia del Akinator");
		
		herramientas.crearBoton( botonJugar,0, 371, 584, 146, Pantalla,Color.BLUE,60);
		herramientas.crearBoton(historia,0, 0, 584, 58, Pantalla, Color.GREEN, 30);
		//SI PRESIONA EL BOTON HISTORIA
		historia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.HistoriaAkinator(Pantalla);
			}
		});
		//Si PRESIONA EL BOTON JUGAR TIENE QUE ELEGIR CONTINENTE
		botonJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				historia.setVisible(false);
				herramientas.sonidoCorto(sonidos);
				try{
					sonidos= AudioSystem.getClip();
					File a = new File("sonido\\musicaComienzo.wav");
					sonidos.open(AudioSystem.getAudioInputStream(a));
					sonidos.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				
			
				Imagen.setVisible(false);
				botonJugar.setVisible(false);
				JLabel Imagen=new JLabel();
				JLabel texto1=new JLabel("ADIVINARE CUALQUIER PAIS QUE ESTES PENSANDO AMIGO");
				JLabel texto2 =new JLabel("ELIGE UN CONTINENTE:");
				herramientas.CambiarColor(Pantalla, Color.BLUE);
				herramientas.CargarImagen(Imagen,"imagenes\\756fae1326eec94458c9861d517c23dd.png", -11, 60, 366, 470, Pantalla);
				herramientas.IngresarTexto(texto1, Pantalla, 15, 20, 11, 512, 14);
				herramientas.IngresarTexto(texto2, Pantalla, 13, 190, 76, 197, 24);
				JButton AmericaSur=new JButton("America Del Sur");
				JButton AmericaNorte=new JButton("America Del Norte");
				JButton Europa=new JButton("Europa");
				JButton Asia=new JButton("Asia");
				JButton Africa=new JButton("Africa");
				JButton Oceania=new JButton("Oceania");
				
				herramientas.crearBoton(AmericaSur, 329, 149, 139, 23, Pantalla, Color.YELLOW,9);
				herramientas.crearBoton(AmericaNorte, 329, 199, 139, 23, Pantalla, Color.YELLOW, 9);
				herramientas.crearBoton(Europa, 329, 249, 139, 23, Pantalla, Color.YELLOW, 9);
				herramientas.crearBoton(Asia, 329, 299, 139, 23, Pantalla, Color.YELLOW, 9);
				herramientas.crearBoton(Africa, 329, 349, 139, 23, Pantalla, Color.YELLOW, 9);
				herramientas.crearBoton(Oceania, 329, 399, 139, 23, Pantalla, Color.YELLOW, 9);
				
				
				//SI ELIGE AMERICA DEL SUR
				AmericaSur.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						texto=new JLabel("HAZ ELEGIDO AMERICA DEL SUR ,ELIGE UN PAIS!!!");
						herramientas.sonidoCorto(sonidos);
						herramientas.PonerFalsoVentanaContinentes(AmericaSur, AmericaNorte, Europa, Asia, Africa, Oceania, texto1, texto2);
						herramientas.CambiarColor(Pantalla, Color.CYAN);
						herramientas.CargarImagen(Imagen,"imagenes\\suramericamap.gif", 235, 51, 349, 463, Pantalla);
						herramientas.CargarImagen(Imagen2,"imagenes\\756fae1326eec94458c9861d517c23dd.png", -13, 51, 251, 463, Pantalla);
						herramientas.IngresarTexto(texto, Pantalla, 15, 92, 11, 411, 14);
						herramientas.BotonConIcono(Boton, "imagenes\\boton_gif.gif", -3, 510, 587, 52, Pantalla);
				  		//SI PRESIONA COMENZAR
						Boton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								herramientas.sonidoCorto(sonidos);
								sonidos.close();
								herramientas.ocultarElementosDeComienzo(Imagen, Imagen2, texto1, texto2, texto, Boton);
								SurAmerica.BDAmericaSur(Pantalla);
								}
						});
						}
				});
				//SI ELIGE AMERICA DEL NORTE
				AmericaNorte.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						texto=new JLabel("HAZ ELEGIDO AMERICA DEL NORTE ,ELIGE UN PAIS!!!");
						herramientas.sonidoCorto(sonidos);
						herramientas.PonerFalsoVentanaContinentes(AmericaSur, AmericaNorte, Europa, Asia, Africa, Oceania, texto1, texto2);
						herramientas.CambiarColor(Pantalla, Color.MAGENTA);
						herramientas.CargarImagen(Imagen, "imagenes\\98142d346997947e449f9cb92baff4b9.jpg",349, 57, 204, 321, Pantalla);
						herramientas.CargarImagen(Imagen2, "imagenes\\756fae1326eec94458c9861d517c23dd.png", 10, 62, 275, 434, Pantalla);
						herramientas.IngresarTexto(texto, Pantalla, 15,63, 11, 474, 14);
						herramientas.BotonConIcono(Boton, "imagenes\\boton_gif.gif", -3, 510, 587, 52, Pantalla);
						//SI PRESIONA COMENZAR
						Boton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								herramientas.sonidoCorto(sonidos);
								sonidos.close();
								herramientas.ocultarElementosDeComienzo(Imagen, Imagen2, texto1, texto2, texto,Boton);
								NorteAmerica.BDAmericaNorte(Pantalla);
								}
						});
						}
				});
				//SI ELIGE EUROPA
				Europa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(sonidos);
						texto=new JLabel("HAZ ELEGIDO EUROPA , ELIGE UN PAIS!!!");
						herramientas.PonerFalsoVentanaContinentes(AmericaSur, AmericaNorte, Europa, Asia, Africa, Oceania, texto1, texto2);
						herramientas.CambiarColor(Pantalla, Color.ORANGE);
						herramientas.CargarImagen(Imagen, "imagenes\\paises-de-la-union-europea-mapa-1.jpg", 187, 78, 397, 437, Pantalla);
						herramientas.CargarImagen(Imagen2, "imagenes\\756fae1326eec94458c9861d517c23dd.png", -54, 79, 278, 423, Pantalla);
						herramientas.IngresarTexto(texto, Pantalla, 15, 80, 11, 406, 14);
						herramientas.BotonConIcono(Boton, "imagenes\\boton_gif.gif", -3, 510, 587, 52, Pantalla);
						//SI PRESIONA COMENZAR
						Boton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								herramientas.sonidoCorto(sonidos);
								sonidos.close();
								herramientas.ocultarElementosDeComienzo(Imagen, Imagen2, texto1, texto2, texto, Boton);
								Europaa.BDeuropa(Pantalla);
								
								}
						});
						}
				});
				//SI ELIGE ASIA
				Asia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(sonidos);
						texto= new JLabel("HAZ ELEGIDO ASIA , ELIGE UN PAIS!!!");
						herramientas.PonerFalsoVentanaContinentes(AmericaSur, AmericaNorte, Europa, Asia, Africa, Oceania, texto1, texto2);
						herramientas.CambiarColor(Pantalla, Color.GREEN);
						herramientas.CargarImagen(Imagen, "imagenes\\image15.png",-50, 133, 454, 329 , Pantalla);
						herramientas.CargarImagen(Imagen2,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,332, 48, 252, 460, Pantalla);
						herramientas.IngresarTexto(texto, Pantalla, 15, 36, 11, 447, 14);
						herramientas.BotonConIcono(Boton, "imagenes\\boton_gif.gif", -3, 510, 587, 52, Pantalla);
						//SI PRESIONA COMENZAR
						Boton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								herramientas.sonidoCorto(sonidos);
								sonidos.close();
								herramientas.ocultarElementosDeComienzo(Imagen, Imagen2, texto1, texto2, texto, Boton);
								asiaa.BDasia(Pantalla);
								}
						});
						}
				});
				//SI ELIGE AFRICA
				Africa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(sonidos);
						texto=new JLabel("HAZ ELEGIDO AFRICA, ELIGE UN PAIS!!!");
						herramientas.PonerFalsoVentanaContinentes(AmericaSur, AmericaNorte, Europa, Asia, Africa, Oceania, texto1, texto2);
						herramientas.CambiarColor(Pantalla, Color.RED);
						herramientas.CargarImagen(Imagen, "imagenes\\poster-afrika-politische-karte-vor-2011-1665118.jpg", -125, 36, 449, 480, Pantalla);
						herramientas.CargarImagen(Imagen2,"imagenes\\756fae1326eec94458c9861d517c23dd.png" , 328, 61, 302, 436, Pantalla);
						herramientas.IngresarTexto(texto, Pantalla, 15, 108, 11, 358, 14);
						herramientas.BotonConIcono(Boton, "imagenes\\boton_gif.gif", -3, 510, 587, 52, Pantalla);
						//SI PRESIONA COMENZAR
						Boton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								herramientas.sonidoCorto(sonidos);
								herramientas.ocultarElementosDeComienzo(Imagen, Imagen2, texto1, texto2, texto, Boton);
								sonidos.close();
								Africaa.BDafrica(Pantalla);
								}
						});
						}
				});
				//SI ELIGE OCEANIA
				Oceania.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(sonidos);
						texto=new JLabel("HAZ ELEGIDO OCEANIA ,ELIGE UN PAIS!!!");
						herramientas.PonerFalsoVentanaContinentes(AmericaSur, AmericaNorte, Europa, Asia, Africa, Oceania, texto1, texto2);
						herramientas.CambiarColor(Pantalla, Color.PINK);
						herramientas.CargarImagen(Imagen, "imagenes\\continente-ocean\u00EDa.jpg",231, 72, 368, 365, Pantalla);
						herramientas.CargarImagen(Imagen2, "imagenes\\756fae1326eec94458c9861d517c23dd.png", -23, 49, 255, 436, Pantalla);
						herramientas.IngresarTexto(texto, Pantalla, 15, -24, 24, 658, 14);
						herramientas.BotonConIcono(Boton, "imagenes\\boton_gif.gif", -3, 510, 587, 52, Pantalla);
						//SI PRESIONA COMENZAR
						Boton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								herramientas.sonidoCorto(sonidos);
								herramientas.ocultarElementosDeComienzo(Imagen, Imagen2, texto1, texto2, texto, Boton);
								sonidos.close();
								oceania.BDOceaniaa(Pantalla);
								}
						});
					}
				});
				
				}
		});
			
		}}
