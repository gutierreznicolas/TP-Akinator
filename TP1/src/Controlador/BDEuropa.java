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

public class BDEuropa {


	
	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel imagen1=new JLabel();
	private JLabel imagen2=new JLabel();
	private JLabel imagen3=new JLabel();
	private PaisesDelJuego paises=new PaisesDelJuego();
	private Clip sonidos;
	
	
	public void BDeuropa(JFrame Pantalla){
		paises.eliminarPorContinente("Europa");
		herramientas.CambiarColor(Pantalla, Color.LIGHT_GRAY);
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		try{
			sonidos= AudioSystem.getClip();
			File a = new File("sonido\\musica Europea.wav");
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
		herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-16, 69, 247, 430 , Pantalla);
		herramientas.CargarImagen(imagen2,"imagenes\\norte sur europa.jpg" ,198, 138, 386, 389 , Pantalla);
		herramientas.CargarImagen(imagen3,"imagenes\\img-thing (26) - copia.jpg" ,120, 0, 259, 145 , Pantalla);
		herramientas.crearBoton(botonSI1, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
		herramientas.crearBoton(botonNO1,243, 533, 89, 23, Pantalla, Color.RED, 16);
		herramientas.crearBoton(botonNOSE1, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
		JLabel PaisesenJuego1=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
		herramientas.PaisesEnJuego(PaisesenJuego1, Pantalla);
		//SI DICE QUE SI PREGUNTA 1
		botonSI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				paises.eliminarPorCarac("norte");
				herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
				JButton botonSI2=new JButton("SI");
				JButton botonNO2=new JButton("NO");
				JButton botonNOSE2=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 2
				herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 78, 247, 430, Pantalla);
				herramientas.CargarImagen(imagen2,"imagenes\\este oeste europa.jpg" ,218, 146, 366, 376 , Pantalla);
				herramientas.CargarImagen(imagen3,"imagenes\\img-thing (27) - copia.jpg" ,134, -18, 267, 166 , Pantalla);
				herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
				//SI DICE QUE SI PREGUNTA 2
				botonSI2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarPorCarac("oeste");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI3=new JButton("SI");
						JButton botonNO3=new JButton("NO");
						JButton botonNOSE3=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 3
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 78, 247, 430 , Pantalla);
						herramientas.CargarImagen(imagen2, "imagenes\\leprechaun-irlanda-232x300.jpg",288, 160, 286, 328 , Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\img-thing (28) - copia.jpg" ,149, 23, 253, 127 , Pantalla);
						herramientas.crearBoton(botonSI3, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO3,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE3, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego3=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego3, Pantalla);
						//SI DICE QUE SI PREGUNTA 3
						botonSI3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("duende");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE QUE NO PREGUNTA 3
						botonNO3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("duende");
								herramientas.ponerEnFalsoBotones(botonSI3, botonNO3, botonNOSE3);
								JButton botonSI4=new JButton("SI");
								JButton botonNO4=new JButton("NO");
								JButton botonNOSE4=new JButton("NO SE");
								PaisesenJuego3.setVisible(false);
								//PREGUNTA 4
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 78, 247, 430, Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\malvinas.jpg" ,257, 165, 299, 277 , Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\img-thing (29) - copia.jpg" ,139, 11, 248, 143 , Pantalla);
								herramientas.crearBoton(botonSI4, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO4,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE4, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego4=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego4, Pantalla);
								//SI DICE QUE SI PREGUNTA 4
								botonSI4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("malvinas");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO PREGUNTA 4
								botonNO4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("malvinas");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE NOSE PREGUNTA 4
								botonNO3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
								}
						});
						//SI DICE NOSE PREGUNTA 3
						botonNOSE3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.ponerEnFalsoBotones(botonSI3, botonNO3, botonNOSE3);
								JButton botonSI4=new JButton("SI");
								JButton botonNO4=new JButton("NO");
								JButton botonNOSE4=new JButton("NO SE");
								PaisesenJuego3.setVisible(false);
								//PREGUNTA 4
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 78, 247, 430, Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\malvinas.jpg" ,257, 165, 299, 277 , Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\img-thing (29) - copia.jpg" ,139, 11, 248, 143 , Pantalla);
								herramientas.crearBoton(botonSI4, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO4,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE4, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego4=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego4, Pantalla);
								//SI DICE QUE SI PREGUNTA 4
								botonSI4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("malvinas");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO PREGUNTA 4
								botonNO4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("malvinas");
										herramientas.ponerEnFalsoBotones(botonSI4, botonNO4, botonNOSE4);
										JButton botonSI5=new JButton("SI");
										JButton botonNO5=new JButton("NO");
										JButton botonNOSE5=new JButton("NO SE");
										PaisesenJuego4.setVisible(false);
										//PREGUNTA 5
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-27, 88, 247, 430 , Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (30) - copia.jpg" ,142, 0, 247, 159 , Pantalla);
										herramientas.CargarImagen(imagen3,"imagenes\\los-reyes-de-holanda-guillermo-alejandro-y-maxima-zorreguieta.jpg" ,84, 181, 511, 305 , Pantalla);
										herramientas.crearBoton(botonSI5, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO5,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE5, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego5=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego5, Pantalla);
										//SI DICE QUE SI PREGUNTA 5
										botonSI5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarPorCarac("reina");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE QUE NO PREGUNTA 5
										botonNO5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarSiCumpleLaCaracteristica("reina");
												Pantalla.setVisible(false);
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
								//SI DICE NOSE PREGUNTA 4
								botonNO3.addActionListener(new ActionListener() {
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
				//SI DICE QUE NO PREGUNTA 2
				botonNO2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarSiCumpleLaCaracteristica("oeste");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI6=new JButton("SI");
						JButton botonNO6=new JButton("NO");
						JButton botonNOSE6=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 6
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-27, 88, 247, 430 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\img-thing (31) - copia.jpg" , 122, 11, 240, 159, Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\queso.jpg" ,211, 193, 373, 327 , Pantalla);
						herramientas.crearBoton(botonSI6, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO6,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE6, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego6=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego6, Pantalla);
						//SI DICE QUE SI PREGUNTA 6
						botonSI6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("queso");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE QUE NO PREGUNTA 6
						botonNO6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("queso");
								herramientas.ponerEnFalsoBotones(botonSI6, botonNO6, botonNOSE6);
								JButton botonSI7=new JButton("SI");
								JButton botonNO7=new JButton("NO");
								JButton botonNOSE7=new JButton("NO SE");
								PaisesenJuego6.setVisible(false);
								//PREGUNTA 7
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 74, 247, 430 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (32) - copia.jpg" ,139, 11, 232, 139 , Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\hitler.jpg" ,264, 144, 297, 290 , Pantalla);
								herramientas.crearBoton(botonSI7, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO7,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE7, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego7=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego7, Pantalla);
								//SI DICE QUE SI PREGUNTA 7
								botonSI7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("hitler");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO PREGUNTA 7
								botonNO7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("hitler");
										herramientas.ponerEnFalsoBotones(botonSI7, botonNO7, botonNOSE7);
										JButton botonSI8=new JButton("SI");
										JButton botonNO8=new JButton("NO");
										JButton botonNOSE8=new JButton("NO SE");
										PaisesenJuego7.setVisible(false);
										//PREGUNTA 8 
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-21, 77, 247, 430 , Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (33) - copia.jpg" ,153, 0, 237, 165 , Pantalla);
										herramientas.CargarImagen(imagen3, "imagenes\\IMG_6228.jpg",170, 165, 414, 359 , Pantalla);
										herramientas.crearBoton(botonSI8, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO8,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE8, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego8=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego8, Pantalla);
										//SI DICE QUE SI PREGUNTA 8
										botonSI8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarPorCarac("estocolmo");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE QUE NO PREGUNTA 8
										botonNO8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarSiCumpleLaCaracteristica("estocolmo");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE NOSE PREGUNTA 8
										botonNOSE8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												herramientas.ponerEnFalsoBotones(botonSI8, botonNO8, botonNOSE8);
												JButton botonSI9=new JButton("SI");
												JButton botonNO9=new JButton("NO");
												JButton botonNOSE9=new JButton("NO SE");
												PaisesenJuego8.setVisible(false);
												//PREGUNTA 9
												herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 72, 247, 430 , Pantalla);
												herramientas.CargarImagen(imagen2,"imagenes\\img-thing (34) - copia.jpg" ,165, 0, 261, 176 , Pantalla);
												herramientas.CargarImagen(imagen3,"imagenes\\p.jpg" ,313, 187, 261, 251 , Pantalla);
												herramientas.crearBoton(botonSI9, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
												herramientas.crearBoton(botonNO9,243, 533, 89, 23, Pantalla, Color.RED, 16);
												herramientas.crearBoton(botonNOSE9, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
												JLabel PaisesenJuego9=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
												herramientas.PaisesEnJuego(PaisesenJuego9, Pantalla);
												//SI DICE QUE SI PREGUNTA 9
												botonSI9.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														paises.eliminarPorCarac("p");
														Pantalla.setVisible(false);
														herramientas.paisElegido(paises.darPais());
														sonidos.close();
													}
												});
												//SI DICE QUE NO PREGUNTA 9
												botonNO9.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														paises.eliminarSiCumpleLaCaracteristica("p");
														Pantalla.setVisible(false);
														herramientas.paisElegido(paises.darPais());
														sonidos.close();
													}
												});
												//SI DICE NOSE PREGUNTA 9
												botonNOSE9.addActionListener(new ActionListener() {
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
								//SI DICE NOSE PREGUNTA 7
								botonNOSE7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
							}
						});
						//SI DICE NOSE PREGUNTA 6
						botonNOSE6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
							}
						});
					}
				});
				//SI DICE NOSE PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
					}
				});
			}
		});
		//SI DICE QUE NO PREGUNTA 1
		botonNO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				paises.eliminarSiCumpleLaCaracteristica("norte");
				herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
				JButton botonSI2=new JButton("SI");
				JButton botonNO2=new JButton("NO");
				JButton botonNOSE2=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 2
				herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 78, 247, 430, Pantalla);
				herramientas.CargarImagen(imagen2,"imagenes\\este oeste europa.jpg" ,218, 146, 366, 376 , Pantalla);
				herramientas.CargarImagen(imagen3,"imagenes\\img-thing (27) - copia.jpg" ,134, -18, 267, 166 , Pantalla);
				herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
				//SI DICE QUE SI PREGUNTA 2
				botonSI2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarPorCarac("oeste");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI10=new JButton("SI");
						JButton botonNO10=new JButton("NO");
						JButton botonNOSE10=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 10
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 72, 247, 430 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\img-thing (35) - copia.jpg" ,127, 11, 244, 129 , Pantalla);
						herramientas.CargarImagen(imagen3, "imagenes\\245px-Tour_Eiffel_Wikimedia_Commons.jpg",286, 151, 267, 377 , Pantalla);
						herramientas.crearBoton(botonSI10, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO10,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE10, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego10=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego10, Pantalla);
						//SI DICE QUE SI PREGUNTA 10
						botonSI10.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("torre");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE QUE NO PREGUNTA 10
						botonNO10.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("torre");
								herramientas.ponerEnFalsoBotones(botonSI10, botonNO10, botonNOSE10);
								JButton botonSI11=new JButton("SI");
								JButton botonNO11=new JButton("NO");
								JButton botonNOSE11=new JButton("NO SE");
								PaisesenJuego10.setVisible(false);
								//PREGUNTA 11
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 72, 247, 430 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (36) - copia.jpg" ,158, 11, 247, 157, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\brasil.jpg" ,158, 206, 426, 308 , Pantalla);
								herramientas.crearBoton(botonSI11, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO11,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE11, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego11=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego11, Pantalla);
								//SI DICE QUE SI PREGUNTA 11
								botonSI11.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("portugues");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE NO A LA PREGUNTA 11
								botonNO11.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("portugues");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE NOSE A LA PREGUNTA 11
								botonNOSE11.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
							}
						});
						//SI DICE NOSE PREGUNTA 10
						botonNOSE10.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
							}
						});
					}
				});
				//SI DICE QUE NO PREGUNTA 2
				botonNO2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarSiCumpleLaCaracteristica("oeste");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI12=new JButton("SI");
						JButton botonNO12=new JButton("NO");
						JButton botonNOSE12=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 12
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 72, 247, 430 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\img-thing (37) - copia - copia.jpg" ,145, 11, 232, 149 , Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\Situado-Vaticano-Iglesia-Catolica-Internet_LRZIMA20170617_0010_11.jpg" ,145, 175, 439, 327 , Pantalla);
						herramientas.crearBoton(botonSI12, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO12,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE12, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego12=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego12, Pantalla);
						//SI DICE QUE SI A LA PREGUNTA 12
						botonSI12.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("vaticano");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE NO A LA PREGUNTA 12
						botonNO12.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("vaticano");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE NOSE PREGUNTA 12
						botonNOSE12.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
							}
						});
					}
				});
				//SI DICE NOSE PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
					herramientas.usuarioSinIdea(Pantalla);
					sonidos.close();
					}
				});
			}
		});
		//SI DICE NOSE PREGUNTA 1
		botonNOSE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				herramientas.usuarioSinIdea(Pantalla);
				sonidos.close();
			}
		});
	}

}
