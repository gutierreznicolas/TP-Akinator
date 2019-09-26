package Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class HerramientasInterface  {

	private JFrame frame;
	private Clip sonido;

	
	
	public void crearBoton(JButton boton , int medida1,int medida2,int medida3, int medida4,JFrame Pantalla,Color color,int TamañoLetra) {
		
		boton.setFont(new Font("Unispace", Font.ITALIC, TamañoLetra));
		boton.setBackground(color);
		boton.setBounds(medida1, medida2, medida3, medida4);
		Pantalla.getContentPane().add(boton);
	}
	public void BotonConIcono(JButton boton ,String imagen , int medida1,int medida2,int medida3, int medida4,JFrame Pantalla ) {
		boton.setIcon(new ImageIcon(imagen));
		boton.setBounds(medida1, medida2, medida3, medida4);
		Pantalla.getContentPane().add(boton);
	}
	public void CargarImagen(JLabel jlabel,String icono , int medida1  , int medida2  , int medida3  ,int medida4 ,JFrame Pantalla) {
		jlabel.setIcon(new ImageIcon(icono));
		jlabel.setBounds(medida1,medida2,medida3,medida4);
		Pantalla.getContentPane().add(jlabel);
	}
	public void CambiarColor(JFrame jframe,Color color) {
		
		jframe.getContentPane().setBackground(color);
	
		
	}
	public void IngresarTexto(JLabel jlabel,JFrame jframe,int tamañoLetra ,int medida1,int medida2,int medida3, int medida4) {
		
		jlabel.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel.setFont(new Font("Unispace", Font.ITALIC, tamañoLetra));
		jlabel.setBounds(medida1, medida2, medida3, medida4);
		jframe.getContentPane().add(jlabel);
	}
	public void PonerFalsoVentanaContinentes(JButton AmericaSur , JButton AmericaNorte, JButton Europa ,JButton Asia ,JButton Africa , JButton Oceania, JLabel texto1 , JLabel texto2) {
		AmericaSur.setVisible(false);
		AmericaNorte.setVisible(false);
		Europa.setVisible(false);
		Asia.setVisible(false);
		Africa.setVisible(false);
		Oceania.setVisible(false);
		texto1.setVisible(false);
		texto2.setVisible(false);
	}
	public void paisElegido(String pais) {
		frame=new JFrame();
		frame.setBounds(100,100,600,600);
		HerramientasInterface herramientas=new HerramientasInterface();
		herramientas.CambiarColor(frame, Color.RED);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		herramientas.ponerIcono("imagenes\\icono.jpg", frame);
		try{
			sonido= AudioSystem.getClip();
			File a = new File("sonido\\suspenso.wav");
			sonido.open(AudioSystem.getAudioInputStream(a));
			sonido.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		//PREGUNTA SI ADIVINO EL PAIS
		JLabel texto1=new JLabel("TU PAIS ES...");
		JLabel texto2=new JLabel(pais);
		JButton botonSI=new JButton("SI");
		JButton botonNO=new JButton("NO");
		
		herramientas.IngresarTexto(texto1, frame, 20, 162, 34, 241, 33);
		herramientas.IngresarTexto(texto2, frame, 20, 98, 243, 324, 33);
		herramientas.crearBoton(botonSI,45, 402, 89, 23, frame, Color.CYAN, 16);
		herramientas.crearBoton(botonNO,428, 402, 89, 23, frame, Color.GREEN, 16);
		//SI DICE QUE SI
		botonSI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonido);
				sonido.close();
				try{
					sonido= AudioSystem.getClip();
					File a = new File("sonido\\adivino.wav");
					sonido.open(AudioSystem.getAudioInputStream(a));
					sonido.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				frame.setVisible(false);
				JFrame pantallaSI=new JFrame();
				pantallaSI.setVisible(true);
				pantallaSI.setBounds(100,100,800,800);
				HerramientasInterface herramientas=new HerramientasInterface();
				herramientas.CambiarColor(pantallaSI, Color.CYAN);
				pantallaSI.getContentPane().setLayout(null);
				herramientas.ponerIcono("imagenes\\icono.jpg", pantallaSI);
				
				
				JLabel texto3=new JLabel("YA LO SABIA AMIGO...");
				JLabel imagen1=new JLabel();
				JButton botonSalir=new JButton("SALIR");
				
				herramientas.IngresarTexto(texto3, pantallaSI, 40,-28, 0, 837, 111);
				herramientas.CargarImagen(imagen1, "imagenes\\igri-akinator-01.jpg", 85, 78, 623, 460, pantallaSI);
				herramientas.crearBoton(botonSalir, 0, 492, 784, 270, pantallaSI, Color.GREEN, 99);
				botonSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sonido.close();
						pantallaSI.setVisible(false);
					}
				});
				
			}
		});
		//SI DICE QUE NO
		botonNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonido);
				sonido.close();
				try{
					sonido= AudioSystem.getClip();
					File a = new File("sonido\\erro.wav");
					sonido.open(AudioSystem.getAudioInputStream(a));
					sonido.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				frame.setVisible(false);
				JFrame pantallaNO=new JFrame();
				pantallaNO.setVisible(true);
				pantallaNO.setBounds(100,100,800,800);
				HerramientasInterface herramientas=new HerramientasInterface();
				herramientas.ponerIcono("imagenes\\icono.jpg", pantallaNO);
				herramientas.CambiarColor(pantallaNO, Color.RED);
				pantallaNO.getContentPane().setLayout(null);
				
				JLabel texto4=new JLabel("NO PUEDE SEEEEEER!!!!!");
				JLabel imagen2=new JLabel();
				JButton botonSalir=new JButton("SALIR");
				
				herramientas.IngresarTexto(texto4, pantallaNO, 40, -28, 0, 837, 111);
				herramientas.CargarImagen(imagen2, "imagenes\\akinator_8_vrai_decouragement.jpg", 10, 83, 774, 608, pantallaNO);
				herramientas.crearBoton(botonSalir,0, 602, 784, 160, pantallaNO, Color.GREEN, 99);
				
				botonSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sonido.close();
						pantallaNO.setVisible(false);
				
					}
				});
				
			}
		});
	
		
		}
	public void ponerEnFalsoBotones(JButton SI , JButton no ,JButton nose) {
		SI.setVisible(false);
		no.setVisible(false);
		nose.setVisible(false);
	}
	public void usuarioSinIdea(JFrame Pantalla) {
		Pantalla.setVisible(false);
		HerramientasInterface herramientas=new HerramientasInterface();
		frame=new JFrame();
		frame.setVisible(true);
		frame.setBounds(100,100,600,600);
		frame.getContentPane().setLayout(null);
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		JLabel imagen=new JLabel();
		JLabel texto=new JLabel("NO SABES MUCHO DEL PAIS QUE HAZ ELEGIDO , MEJOR PRUEBA CON OTRO!!!");
		JButton boton=new JButton("SALIR");
		herramientas.CambiarColor(frame, Color.RED);
		
		herramientas.CargarImagen(imagen, "imagenes\\0eb907b6d116fef38606b27ef42bff01--the-games-yarn-wig.jpg", 164, 70, 248, 366, frame);
		herramientas.IngresarTexto(texto, frame, 12, 10, 11, 542, 14);
		herramientas.crearBoton(boton, 0, 515, 584, 47, frame, Color.BLUE, 16);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		}
		

		public void sonidoCorto(Clip clip) {
			try{
				clip= AudioSystem.getClip();
				File a = new File("sonido\\botonSonido.wav");
				clip.open(AudioSystem.getAudioInputStream(a));
				clip.start();
				
				}
				catch (Exception tipoerror) {
					System.out.println("" + tipoerror);
				}
		}
		public void HistoriaAkinator(JFrame Pantalla) {
			Pantalla.setVisible(false);
			frame=new JFrame();
			frame.setBounds(100,100,600,600);
			HerramientasInterface herramientas=new HerramientasInterface();
			herramientas.CambiarColor(frame, Color.BLACK);
			frame.getContentPane().setLayout(null);
			herramientas.ponerIcono("imagenes\\icono.jpg", frame);
			frame.setVisible(true);
			try{
				sonido= AudioSystem.getClip();
				File a = new File("sonido\\La Historia Sobre Akinator.wav");
				sonido.open(AudioSystem.getAudioInputStream(a));
				sonido.start();
				
				}
				catch (Exception tipoerror) {
					System.out.println("" + tipoerror);
				}
			JLabel texto=new JLabel("Esta es mi historia...");
			JLabel imagen=new JLabel();
			JButton volver=new JButton("VOLVER");
			herramientas.IngresarTexto(texto, frame, 20, 10, 67, 310, 31);
			herramientas.CargarImagen(imagen, "imagenes\\historia.jpg",31, 98, 584, 453, frame);
			herramientas.crearBoton(volver,157, 33, 271, 23, frame, Color.GREEN, 20);
			
			volver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sonido.close();
					frame.setVisible(false);
					Pantalla.setVisible(true);
				}
			});
			
		}
		public void ponerIcono(String imagen,JFrame Pantalla) {
			Pantalla.setIconImage(Toolkit.getDefaultToolkit().getImage(imagen));
		}
		public void PaisesEnJuego(JLabel texto,JFrame Pantalla){
			texto.setFont(new Font("Unispace", Font.ITALIC, 10));
			texto.setBounds(468, 11, 145, 26);
			Pantalla.getContentPane().add(texto);
			
		}
		
		public void ocultarElementosDeComienzo(JLabel Imagen , JLabel Imagen2,JLabel texto1, JLabel texto2,JLabel texto , JButton Boton) {
			Imagen.setVisible(false);
			Imagen2.setVisible(false);
			texto1.setVisible(false);
			texto2.setVisible(false);
			texto.setVisible(false);
			Boton.setVisible(false);
			
		}
		
		
}
	