package Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Modelo.PaisesDelJuego;

public class BDOceania {

	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel imagen1=new JLabel();
	private JLabel imagen2=new JLabel();
	private JLabel imagen3=new JLabel();
	private PaisesDelJuego paises=new PaisesDelJuego();
	private Clip sonidos;
	
	public void BDOceaniaa(JFrame Pantalla) {
		paises.eliminarPorContinente("Oceania");
		
		herramientas.CambiarColor(Pantalla, Color.orange);
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		try{
			sonidos= AudioSystem.getClip();
			File a = new File("sonido\\musica Oceania.wav");
			sonidos.open(AudioSystem.getAudioInputStream(a));
			sonidos.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		JButton botonSI1=new JButton("SI");
		JButton botonNO1=new JButton("NO");
		JButton botonNOSE1=new JButton("NO SE");
		
		//PREGUNTA 1
		herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png", 10, 63, 257, 436, Pantalla);
		herramientas.CargarImagen(imagen2, "imagenes\\img-thing.jpg",199, 11, 243, 128, Pantalla);
		herramientas.CargarImagen(imagen3, "imagenes\\250px-Kangaroo_and_joey03.jpg", 311, 150, 257, 325, Pantalla);
		herramientas.crearBoton(botonSI1, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
		herramientas.crearBoton(botonNO1,243, 533, 89, 23, Pantalla, Color.RED, 16);
		herramientas.crearBoton(botonNOSE1, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
		JLabel PaisesenJuego1=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
		herramientas.PaisesEnJuego(PaisesenJuego1, Pantalla);
		//SI DICE QUE SI PREGUNTA 1
		botonSI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				Pantalla.setVisible(false);
				paises.eliminarPorCarac("canguro");
				herramientas.paisElegido(paises.darPais());
				sonidos.close();
				
				}
		});
		
		//SI DICE QUE NO PREGUNTA 1
		botonNO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				herramientas.ponerEnFalsoBotones(botonSI1, botonNOSE1, botonNO1);
				paises.eliminarSiCumpleLaCaracteristica("canguro");
				JButton botonSI2=new JButton("SI");
				JButton botonNO2=new JButton("NO");
				JButton botonNOSE2=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 2
				herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png", 0, 38, 276, 444, Pantalla);
				herramientas.CargarImagen(imagen2, "imagenes\\allblacks.jpg", 261, 193, 313, 267, Pantalla);
				herramientas.CargarImagen(imagen3, "imagenes\\img-thing (3) - copia.jpg", 158, 0, 235, 144, Pantalla);
				herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
				//SI DICE QUE SI PREGUNTA 2
				botonSI2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						Pantalla.setVisible(false);
						paises.eliminarPorCarac("rugby");
						herramientas.paisElegido(paises.darPais());
						sonidos.close();
						}
				});
				//SI DICE QUE NO PREGUNTA 2
				botonNO2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						Pantalla.setVisible(false);
						paises.eliminarSiCumpleLaCaracteristica("rugby");
						herramientas.paisElegido(paises.darPais());
						sonidos.close();
					}
				});
				//SI DICE QUE NOSE PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI3=new JButton("SI");
						JButton botonNO3=new JButton("NO");
						JButton botonNOSE3=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 3 OCEANIA
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png", 10, 59, 270, 436, Pantalla);
						herramientas.CargarImagen(imagen2, "imagenes\\ave.jpg", 241, 198, 333, 305, Pantalla);
						herramientas.CargarImagen(imagen3, "imagenes\\img-thing (4) - copia.jpg", 181, 11, 256, 161, Pantalla);
						herramientas.crearBoton(botonSI3, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO3,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE3, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego3=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego3, Pantalla);
						//SI DICE QUE SI PREGUNTA 3
						botonSI3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								Pantalla.setVisible(false);
								paises.eliminarPorCarac("ave");
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
								}
						});
						//SI DICE QUE NO PREGUNTA 3
						botonNO3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Pantalla.setVisible(false);
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("ave");
								sonidos.close();
								herramientas.paisElegido(paises.darPais());	
								}
							});
								
								
						
						//SI DICE NOSE PREGUNTA 3
						botonNOSE3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
										herramientas.ponerEnFalsoBotones(botonSI3, botonNO3, botonNOSE3);
										JButton botonSI5=new JButton("SI");
										JButton botonNO5=new JButton("NO");
										JButton botonNOSE5=new JButton("NO SE");
										PaisesenJuego3.setVisible(false);
										//PREGUNTA 5
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png", 0, 96, 286, 436, Pantalla);
										herramientas.CargarImagen(imagen2, "imagenes\\download.png", 331, 211, 243, 249, Pantalla);
										herramientas.CargarImagen(imagen3, "imagenes\\img-thing (6) - copia.jpg", 163, 28, 237, 170, Pantalla);
										herramientas.crearBoton(botonSI5, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO5,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE5, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego5=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego5, Pantalla);
										//SI DICE SI PREGUNTA 5
										botonSI5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												Pantalla.setVisible(false);
												paises.eliminarPorCarac("z");
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
												}
										});
										//SI DICE QUE NO A LA PREGUNTA 5
										botonNO5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												Pantalla.setVisible(false);
												paises.eliminarSiCumpleLaCaracteristica("z");
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE NOSE PREGUNTA 5
										botonNOSE5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												herramientas.usuarioSinIdea(Pantalla);
												sonidos.close();
											}
										});
										}
								});
								}
				});
				}
			});
		//SI DICE NO SE PREGUNTA 1
			botonNOSE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
				JButton botonSI4=new JButton("SI");
				JButton botonNO4=new JButton("NO");
				JButton botonNOSE4=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 4
				herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png", 0, 84, 285, 436, Pantalla);
				herramientas.CargarImagen(imagen2, "imagenes\\img-thing (5) - copia.jpg", 183, 37, 233, 161, Pantalla);
				herramientas.CargarImagen(imagen3, "imagenes\\NUMERO2.jpg", 296, 230, 251, 222, Pantalla);
				herramientas.crearBoton(botonSI4, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO4,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE4, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego4=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego4, Pantalla);
				//SI DICE QUE SI PREGUNTA 4
				botonSI4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarPorCarac("2 palabras");
						herramientas.ponerEnFalsoBotones(botonSI4, botonNO4, botonNOSE4);
						JButton botonSI5=new JButton("SI");
						JButton botonNO5=new JButton("NO");
						JButton botonNOSE5=new JButton("NO SE");
						PaisesenJuego4.setVisible(false);
						//PREGUNTA 5
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png", 0, 96, 286, 436, Pantalla);
						herramientas.CargarImagen(imagen2, "imagenes\\download.png", 331, 211, 243, 249, Pantalla);
						herramientas.CargarImagen(imagen3, "imagenes\\img-thing (6) - copia.jpg", 163, 28, 237, 170, Pantalla);
						herramientas.crearBoton(botonSI5, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO5,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE5, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego5=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego5, Pantalla);
						//SI DICE SI PREGUNTA 5
						botonSI5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								Pantalla.setVisible(false);
								paises.eliminarPorCarac("z");
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
								}
						});
						//SI DICE QUE NO A LA PREGUNTA 5
						botonNO5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								Pantalla.setVisible(false);
								paises.eliminarSiCumpleLaCaracteristica("z");
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE NOSE PREGUNTA 5
						botonNOSE5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
							}
						});
						}
				});
				//SI DICE NO PREGUNTA 4
				botonNO4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						Pantalla.setVisible(false);
						paises.eliminarSiCumpleLaCaracteristica("2 palabras");
						herramientas.paisElegido(paises.darPais());
						sonidos.close();
					}
				});
				//SI DICE NOSE PREGUNTA 4
				botonNOSE4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
					}
				});
				}
		});
	}

}
