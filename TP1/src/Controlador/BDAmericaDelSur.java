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

public class BDAmericaDelSur {
	
	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel imagen1=new JLabel();
	private JLabel imagen2=new JLabel();
	private JLabel imagen3=new JLabel();
	private Clip sonidos;

	
		public void BDAmericaSur(JFrame Pantalla) {
		PaisesDelJuego paises=new PaisesDelJuego();
		paises.eliminarPorContinente("Sur America");
		herramientas.CambiarColor(Pantalla, Color.BLUE);
		Pantalla.setBounds(100, 100, 600, 600);
		JButton botonSI1=new JButton("SI");
		JButton botonNO1=new JButton("NO");
		JButton botonNOSE1=new JButton("NO SE");
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		try{
			sonidos= AudioSystem.getClip();
			File a = new File("sonido\\musica latina.wav");
			sonidos.open(AudioSystem.getAudioInputStream(a));
			sonidos.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		
		
		//PREGUNTA 1
		herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" , -13, 73, 266, 450, Pantalla);
		herramientas.CargarImagen(imagen2, "imagenes\\north-shore.jpg",141, 149, 443, 341 , Pantalla);
		herramientas.CargarImagen(imagen3,"imagenes\\img-thing (11) - copia.jpg" , 126, 11, 300, 138, Pantalla);
		herramientas.crearBoton(botonSI1, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
		herramientas.crearBoton(botonNO1,243, 533, 89, 23, Pantalla, Color.RED, 16);
		herramientas.crearBoton(botonNOSE1, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
		JLabel PaisesenJuego1=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
		herramientas.PaisesEnJuego(PaisesenJuego1, Pantalla);
		//SI DICE QUE SI PREGUNTA 1
				botonSI1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarPorCarac("mar");
						herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
						JButton botonSI2=new JButton("SI");
						JButton botonNO2=new JButton("NO");
						JButton botonNOSE2=new JButton("NO SE");
						PaisesenJuego1.setVisible(false);
						//PREGUNTA 2
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-13, 85, 263, 426 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\Copa-Mundo-Panama-Foto-AFP_MEDIMA20180118_0153_5.jpg" ,117, 143, 467, 373 , Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\img-thing (12) - copia.jpg" ,117, 11, 245, 149, Pantalla);
						herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
						//SI DICE QUE SI A LA PREGUNTA 2
						botonSI2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("mundial");
								herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
								JButton botonSI3=new JButton("SI");
								JButton botonNO3=new JButton("NO");
								JButton botonNOSE3=new JButton("NO SE");
								PaisesenJuego2.setVisible(false);
								//PREGUNTA 3
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (13) - copia.jpg" , 194, 11, 253, 134, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\SOL.jpg" ,233, 177, 351, 215 , Pantalla);
								herramientas.crearBoton(botonSI3, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO3,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE3, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego3=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego3, Pantalla);
								//SI DICE QUE SI A LA PREGUNTA 3
								botonSI3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("sol");
										herramientas.ponerEnFalsoBotones(botonSI3, botonNO3, botonNOSE3);
										JButton botonSI4=new JButton("SI");
										JButton botonNO4=new JButton("NO");
										JButton botonNOSE4=new JButton("NO SE");
										PaisesenJuego3.setVisible(false);
										//PREGUNTA 4
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (14) - copia.jpg" ,143, 11, 242, 136, Pantalla);
										herramientas.CargarImagen(imagen3,"imagenes\\messi.jpg" ,319, 173, 174, 310 , Pantalla);
										herramientas.crearBoton(botonSI4, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO4,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE4, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego4=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego4, Pantalla);
										//SI DICE QUE SI A LA PREGUNTA 4
										botonSI4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												Pantalla.setVisible(false);
												paises.eliminarPorCarac("messi");
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE QUE NO A LA PREGUNTA 4
										botonNO4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												Pantalla.setVisible(false);
												paises.eliminarSiCumpleLaCaracteristica("messi");
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE NOSE A LA PREGUNTA 4
										botonNOSE4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												Pantalla.setVisible(false);
												herramientas.usuarioSinIdea(Pantalla);
												sonidos.close();
									}
								});
									}
								});
								//SI DICE QUE NO A LA PREGUNTA 3
								botonNO3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("sol");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
										}
								});
								//SI DICE QUE NO SE A LA PREGUNTA 3
								botonNOSE3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
										}
								});
							}
						});
							//SI DICE QUE NO A LA PREGUNTA 2
						botonNO2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("mundial");
								herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
								JButton botonSI7=new JButton("SI");
								JButton botonNO7=new JButton("NO");
								JButton botonNOSE7=new JButton("NO SE");
								PaisesenJuego2.setVisible(false);
								//PREGUNTA 7
								herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (18) - copia.jpg" ,168, 0, 261, 144, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\americasur.gif" ,178, 137, 389, 382 , Pantalla);
								herramientas.crearBoton(botonSI7, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO7,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE7, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego7=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego7, Pantalla);
								//SI DICEN QUE SI A LA PREGUNTA 7
								botonSI7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("pacifico");
										herramientas.ponerEnFalsoBotones(botonSI7, botonNO7, botonNOSE7);
										JButton botonSI8=new JButton("SI");
										JButton botonNO8=new JButton("NO");
										JButton botonNOSE8=new JButton("NO SE");
										PaisesenJuego7.setVisible(false);
										//PREGUNTA 8
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-14, 71, 263, 446 , Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (19) - copia.jpg" ,152, 29, 249, 132, Pantalla);
										herramientas.CargarImagen(imagen3,"imagenes\\terremoto-chile-2.jpg" ,152, 209, 432, 272, Pantalla);
										herramientas.crearBoton(botonSI8, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO8,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE8, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego8=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego8, Pantalla);
										//SI DICE QUE SI A LA PREGUNTA 8
										botonSI8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												Pantalla.setVisible(false);
												paises.eliminarPorCarac("terremoto");
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE QUE NO A LA PREGUNTA 8
										botonNO8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarSiCumpleLaCaracteristica("terremoto");
												herramientas.ponerEnFalsoBotones(botonSI8, botonNO8, botonNOSE8);
												JButton botonSI9=new JButton("SI");
												JButton botonNO9=new JButton("NO");
												JButton botonNOSE9=new JButton("NO SE");
												PaisesenJuego8.setVisible(false);
												//PREGUNTA 9
												herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png",-14, 71, 263, 446 , Pantalla);
												herramientas.CargarImagen(imagen2,"imagenes\\img-thing (20) - copia.jpg" ,143, 11, 258, 161 , Pantalla);
												herramientas.CargarImagen(imagen3,"imagenes\\numero-4-infantil-chunk.jpg" ,231, 196, 364, 262 , Pantalla);
												herramientas.crearBoton(botonSI9, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
												herramientas.crearBoton(botonNO9,243, 533, 89, 23, Pantalla, Color.RED, 16);
												herramientas.crearBoton(botonNOSE9, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
												JLabel PaisesenJuego9=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
												herramientas.PaisesEnJuego(PaisesenJuego9, Pantalla);
												//SI DICE QUE SI A LA PREGUNTA 9
												botonSI9.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														Pantalla.setVisible(false);
														paises.eliminarPorCarac("4");
														herramientas.paisElegido(paises.darPais());
														sonidos.close();
													}
												});
												//SI DICE QUE NO A LA PREGUNTA 9
												botonNO9.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														paises.eliminarSiCumpleLaCaracteristica("4");
														herramientas.ponerEnFalsoBotones(botonSI9, botonNO9, botonNOSE9);
														JButton botonSI10=new JButton("SI");
														JButton botonNO10=new JButton("NO");
														JButton botonNOSE10=new JButton("NO SE");
														PaisesenJuego9.setVisible(false);
														//PREGUNTA 10
														herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png",-14, 71, 263, 446 , Pantalla);
														herramientas.CargarImagen(imagen2,"imagenes\\Pablo Escobar.jpg" ,259, 203, 263, 248 , Pantalla);
														herramientas.CargarImagen(imagen3,"imagenes\\img-thing (22) - copia.jpg" ,125, 24, 263, 139 , Pantalla);
														herramientas.crearBoton(botonSI10, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
														herramientas.crearBoton(botonNO10,243, 533, 89, 23, Pantalla, Color.RED, 16);
														herramientas.crearBoton(botonNOSE10, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
														JLabel PaisesenJuego10=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
														herramientas.PaisesEnJuego(PaisesenJuego10, Pantalla);
														//SI DICE QUE SI A LA PREGUNTA 10
														botonSI10.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																herramientas.sonidoCorto(sonidos);
																	Pantalla.setVisible(false);
																	paises.eliminarPorCarac("Pablo Escobar");
																	herramientas.paisElegido(paises.darPais());
																	sonidos.close();
															}
														
														});
														//SI DICE QUE NO A LA PREGUNTA 10
														botonNO10.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																herramientas.sonidoCorto(sonidos);
																Pantalla.setVisible(false);
																paises.eliminarSiCumpleLaCaracteristica("Pablo Escobar");
																herramientas.paisElegido(paises.darPais());
																sonidos.close();
															}
														});
														//SI DICE NO SE A LA PREGUNTA 10
														botonNOSE10.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																herramientas.sonidoCorto(sonidos);
																herramientas.usuarioSinIdea(Pantalla);
																sonidos.close();
															}
														});
													}
												});
												//SI DICE NOCE A LA PREGUNTA 9
												botonNOSE9.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														herramientas.usuarioSinIdea(Pantalla);
														sonidos.close();
													}
												});
											}
										});
										//SI DICE NOCE A LA PREGUNTA 8
										botonNOSE8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												herramientas.usuarioSinIdea(Pantalla);
												sonidos.close();
											}
										});
									}
								});
								//SI DICE QUE NO A LA PREGUNTA 7
								botonNO7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										Pantalla.setVisible(false);
										paises.eliminarSiCumpleLaCaracteristica("pacifico");
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
										}
								});
								//SI DICE NO SE A LA PREGUNTA 7
								botonNOSE7.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
							}
						});
						//SI DICE NOSE A LA PREGUNTA 2
						botonNOSE2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
								}
						});
					}
		});
				//SI DICE QUE NO A LA PREGUNTA 1
				botonNO1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarSiCumpleLaCaracteristica("mar");
						herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
						JButton botonSI5=new JButton("SI");
						JButton botonNO5=new JButton("NO");
						JButton botonNOSE5=new JButton("NO SE");
						PaisesenJuego1.setVisible(false);
						//PREGUNTA 5
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 70, 263, 446 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\asuncion.jpg" ,263, 166, 311, 195 , Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\img-thing (16) - copia.jpg" ,153, 11, 257, 144 , Pantalla);
						herramientas.crearBoton(botonSI5, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO5,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE5, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego5=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego5, Pantalla);
						//SI DICE QUE SI A LA PREGUNTA 5
						botonSI5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("asuncion");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE QUE NO A LA PREGUNTA 5
						botonNO5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("asuncion");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE NOSE A LA PREGUNTA 5
						botonNOSE5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.ponerEnFalsoBotones(botonSI5, botonNO5, botonNOSE5);
								JButton botonSI6=new JButton("SI");
								JButton botonNO6=new JButton("NO");
								JButton botonNOSE6=new JButton("NO SE");
								PaisesenJuego5.setVisible(false);
								//PREGUNTA 6
								herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 70, 263, 446 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\B.jpg" ,290, 172, 228, 251 , Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\img-thing (17) - copia.jpg" ,168, 11, 253, 150 , Pantalla);
								herramientas.crearBoton(botonSI6, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO6,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE6, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego6=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego6, Pantalla);
								//SI DICE QUE SI A LA PREGUNTA 6
								botonSI6.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										Pantalla.setVisible(false);
										paises.eliminarPorCarac("b");
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO A LA PREGUNTA 6
								botonNO6.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										Pantalla.setVisible(false);
										paises.eliminarSiCumpleLaCaracteristica("b");
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE NOSE A LA PREGUNTA 6
								botonNOSE6.addActionListener(new ActionListener() {
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
				//SI DICE NOSE A LA PREGUNTA 1
				botonNOSE1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
						}
				});
				}

}
