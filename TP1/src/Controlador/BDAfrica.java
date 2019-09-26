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

public class BDAfrica {
	
	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel imagen1=new JLabel();
	private JLabel imagen2=new JLabel();
	private JLabel imagen3=new JLabel();
	private PaisesDelJuego paises=new PaisesDelJuego();
	private Clip sonidos;

	
		public void BDafrica(JFrame Pantalla) {
		paises.eliminarPorContinente("Africa");
		herramientas.CambiarColor(Pantalla, Color.BLUE);
		JButton botonSI1=new JButton("SI");
		JButton botonNO1=new JButton("NO");
		JButton botonNOSE1=new JButton("NO SE");
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		try{
			sonidos= AudioSystem.getClip();
			File a = new File("sonido\\musicaAfrica.wav");
			sonidos.open(AudioSystem.getAudioInputStream(a));
			sonidos.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		//PREGUNTA 1
		herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" , -13, 73, 266, 450, Pantalla);
		herramientas.CargarImagen(imagen2, "imagenes\\fotoMarM.PNG",141, 149, 443, 341 , Pantalla);
		herramientas.CargarImagen(imagen3,"imagenes\\paisMediterraneo.jpg" , 126, 11, 300, 138, Pantalla);
		herramientas.crearBoton(botonSI1, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
		herramientas.crearBoton(botonNO1,243, 533, 89, 23, Pantalla, Color.RED, 16);
		herramientas.crearBoton(botonNOSE1, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
		JLabel PaisesenJuego1=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
		herramientas.PaisesEnJuego(PaisesenJuego1, Pantalla);
		//SI DICE QUE NOSE A LA PREGUNTA 1
		botonNOSE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				Pantalla.setVisible(false);
				herramientas.usuarioSinIdea(Pantalla);
				sonidos.close();
	}
});
			//SI DICE QUE SI PREGUNTA 1
			botonSI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				paises.eliminarPorCarac("marM");
				herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
				JButton botonSI2=new JButton("SI");
				JButton botonNO2=new JButton("NO");
				JButton botonNOSE2=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 2
				herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-13, 85, 263, 426 , Pantalla);
				herramientas.CargarImagen(imagen2,"imagenes\\fotoEstrella.PNG" ,300, 143, 500, 373 , Pantalla);
				herramientas.CargarImagen(imagen3,"imagenes\\estrellaEnSuBandera.jpg" ,117, 11, 245, 149, Pantalla);
				herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
				//SI DICE NOSE A LA PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						Pantalla.setVisible(false);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
					}
				});
				//SI DICE QUE SI A LA PREGUNTA 2
				botonSI2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarPorCarac("banderaE");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI3=new JButton("SI");
						JButton botonNO3=new JButton("NO");
						JButton botonNOSE3=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 3
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-13, 85, 263, 426 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\capitalArgel.jpg" ,117, 11, 245, 149 , Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\argel.PNG" ,117, 143, 467, 373, Pantalla);
						herramientas.crearBoton(botonSI3, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO3,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE3, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego3=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego3, Pantalla);
						//SI DICE QUE SI A LA PREGUNTA 3
						botonSI3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								Pantalla.setVisible(false);
								paises.eliminarPorCarac("argel");
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
							}
						});
						//SI DICE NOSE A LA PREGUNTA 3
						botonNOSE3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								Pantalla.setVisible(false);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
						}
						});
						//SI DICE QUE NO A LA PREGUNTA 3
						botonNO3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								Pantalla.setVisible(false);
								paises.eliminarSiCumpleLaCaracteristica("argel");
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
								}
						});
						}
						});
				//SI DICE NOSE A LA PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						Pantalla.setVisible(false);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
					}
				});
						//SI DICE QUE NO A LA PREGUNTA 2
						botonNO2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("banderaE");
								herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
								JButton botonSI4=new JButton("SI");
								JButton botonNO4=new JButton("NO");
								JButton botonNOSE4=new JButton("NO SE");
								PaisesenJuego2.setVisible(false);
								//PREGUNTA 4
								herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\pregPiramide.JPG" ,168, 0, 261, 144, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\piramide.PNG" ,178, 137, 389, 382 , Pantalla);
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
										paises.eliminarPorCarac("piramide");
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
						}
									});
								//SI DICE QUE NO A LA PREGUNTA 4
								botonNO4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										Pantalla.setVisible(false);
										paises.eliminarSiCumpleLaCaracteristica("piramide");
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
										}
								});
								//si dice nose a la pregunta 4
								botonNOSE4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										Pantalla.setVisible(false);
										sonidos.close();
										herramientas.usuarioSinIdea(Pantalla);
									}
									});
							}
				});
				}
				});
			//Si dice que no a la pregunta 1
			botonNO1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					herramientas.sonidoCorto(sonidos);
					paises.eliminarSiCumpleLaCaracteristica("marM");
					herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
					JButton botonSI5=new JButton("SI");
					JButton botonNO5=new JButton("NO");
					JButton botonNOSE5=new JButton("NO SE");
					PaisesenJuego1.setVisible(false);
					//PREGUNTA 5
					herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
					herramientas.CargarImagen(imagen2,"imagenes\\estrellaEnSuBandera.jpg" ,168, 0, 261, 144, Pantalla);
					herramientas.CargarImagen(imagen3,"imagenes\\fotoEstrella.PNG" ,178, 137, 389, 382 , Pantalla);
					herramientas.crearBoton(botonSI5, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
					herramientas.crearBoton(botonNO5,243, 533, 89, 23, Pantalla, Color.RED, 16);
					herramientas.crearBoton(botonNOSE5, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
					JLabel PaisesenJuego5=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
					herramientas.PaisesEnJuego(PaisesenJuego5, Pantalla);
					//SI DICE QUE NOSE A LA PREGUNTA 5
					botonNOSE5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							Pantalla.setVisible(false);
							herramientas.usuarioSinIdea(Pantalla);
							sonidos.close();
				}
			});
					//SI DICE QUE NO A LA PREGUNTA 5
					botonNO5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							paises.eliminarSiCumpleLaCaracteristica("banderaE");
							herramientas.ponerEnFalsoBotones(botonSI5, botonNO5, botonNOSE5);
							JButton botonSI6=new JButton("SI");
							JButton botonNO6=new JButton("NO");
							JButton botonNOSE6=new JButton("NO SE");
							PaisesenJuego5.setVisible(false);
					//PREGUNTA 6
					herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
					herramientas.CargarImagen(imagen2,"imagenes\\unColor.jpg" ,168, 0, 261, 144, Pantalla);
					herramientas.CargarImagen(imagen3,"imagenes\\marruecos.PNG" ,178, 137, 389, 382 , Pantalla);
					herramientas.crearBoton(botonSI6, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
					herramientas.crearBoton(botonNO6,243, 533, 89, 23, Pantalla, Color.RED, 16);
					herramientas.crearBoton(botonNOSE6, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
					JLabel PaisesenJuego6=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
					herramientas.PaisesEnJuego(PaisesenJuego6, Pantalla);
					//SI DICE NOSE A LA PREGUNTA 9
					botonNOSE6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							Pantalla.setVisible(false);
							herramientas.usuarioSinIdea(Pantalla);
							sonidos.close();
					}
					});
					//SI DICE QUE SI A LA PREGUNTA 6
					botonSI6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							Pantalla.setVisible(false);
							paises.eliminarPorCarac("bandera1");
							herramientas.paisElegido(paises.darPais());
							sonidos.close();
							}
					});
					//SI DICE QUE NO A LA PREGUNTA 6
					botonNO6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							Pantalla.setVisible(false);
							paises.eliminarSiCumpleLaCaracteristica("bandera1");
							herramientas.paisElegido(paises.darPais());
							sonidos.close();
						}
					});
					}
					});
					
					//SI DICE QUE SI A LA PREGUNTA 5
					botonSI5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							paises.eliminarPorCarac("banderaE");
							herramientas.ponerEnFalsoBotones(botonSI5, botonNO5, botonNOSE5);
							JButton botonSI7=new JButton("SI");
							JButton botonNO7=new JButton("NO");
							JButton botonNOSE7=new JButton("NO SE");
							PaisesenJuego5.setVisible(false);
							//PREGUNTA 7
							herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
							herramientas.CargarImagen(imagen2,"imagenes\\desnutrucion.jpg" ,168, 0, 261, 144, Pantalla);
							herramientas.CargarImagen(imagen3,"imagenes\\niñosomali.PNG" ,178, 137, 389, 382 , Pantalla);
							herramientas.crearBoton(botonSI7, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
							herramientas.crearBoton(botonNO7,243, 533, 89, 23, Pantalla, Color.RED, 16);
							herramientas.crearBoton(botonNOSE7, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
							JLabel PaisesenJuego7=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
							herramientas.PaisesEnJuego(PaisesenJuego7, Pantalla);
							//SI DICE QUE SI A LA PREGUNTA 7
							botonSI7.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									herramientas.sonidoCorto(sonidos);
									Pantalla.setVisible(false);
									paises.eliminarPorCarac("desnutricion");
									herramientas.paisElegido(paises.darPais());
									sonidos.close();
									}
							});
							//si dice nose pregunta 7
							botonNOSE7.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									herramientas.sonidoCorto(sonidos);
									Pantalla.setVisible(false);
									herramientas.usuarioSinIdea(Pantalla);
									sonidos.close();
						}
					});
							//SI DICE QUE NO A LA PREGUNTA 7
							botonNO7.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									herramientas.sonidoCorto(sonidos);
									paises.eliminarSiCumpleLaCaracteristica("desnutricion");
									herramientas.ponerEnFalsoBotones(botonSI7, botonNO7, botonNOSE7);
									JButton botonSI8=new JButton("SI");
									JButton botonNO8=new JButton("NO");
									JButton botonNOSE8=new JButton("NO SE");
									PaisesenJuego7.setVisible(false);
									//PREGUNTA 8
									herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
									herramientas.CargarImagen(imagen2,"imagenes\\fotoEto.jpg" ,168, 0, 261, 144, Pantalla);
									herramientas.CargarImagen(imagen3,"imagenes\\Eto.PNG" ,178, 137, 389, 382 , Pantalla);
									herramientas.crearBoton(botonSI8, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
									herramientas.crearBoton(botonNO8,243, 533, 89, 23, Pantalla, Color.RED, 16);
									herramientas.crearBoton(botonNOSE8, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
									JLabel PaisesenJuego8=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
									herramientas.PaisesEnJuego(PaisesenJuego8, Pantalla);
									botonNOSE8.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											herramientas.sonidoCorto(sonidos);
											Pantalla.setVisible(false);
											herramientas.usuarioSinIdea(Pantalla);
											sonidos.close();
								}
							});
									
									//Si dice que si a la pregunta 8
									botonSI8.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											herramientas.sonidoCorto(sonidos);
											Pantalla.setVisible(false);
											paises.eliminarPorCarac("Eto");
											herramientas.paisElegido(paises.darPais());
											sonidos.close();
											}
									});
									//SI DICE NOSE PREGUNTA 8
									botonNOSE8.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											herramientas.sonidoCorto(sonidos);
											Pantalla.setVisible(false);
											herramientas.usuarioSinIdea(Pantalla);
											sonidos.close();
								}
							});
									//SI DICE QUE NO A LA PREGUNTA 8
										botonNO8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
											herramientas.sonidoCorto(sonidos);
											paises.eliminarSiCumpleLaCaracteristica("Eto");
											herramientas.ponerEnFalsoBotones(botonSI8, botonNO8, botonNOSE8);
											JButton botonSI9=new JButton("SI");
											JButton botonNO9=new JButton("NO");
											JButton botonNOSE9=new JButton("NO SE");
											PaisesenJuego8.setVisible(false);
											//Pregunta 9
											herramientas.CargarImagen(imagen1, "imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 68, 287, 436, Pantalla);
											herramientas.CargarImagen(imagen2,"imagenes\\preganguila.jpg" ,168, 0, 261, 144, Pantalla);
											herramientas.CargarImagen(imagen3,"imagenes\\anguila.PNG" ,178, 137, 389, 382 , Pantalla);
											herramientas.crearBoton(botonSI9, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
											herramientas.crearBoton(botonNO9,243, 533, 89, 23, Pantalla, Color.RED, 16);
											herramientas.crearBoton(botonNOSE9, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
											JLabel PaisesenJuego11=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
											herramientas.PaisesEnJuego(PaisesenJuego11, Pantalla);
											//SI DICE QUE SI A LA PREGUNTA 9
											botonSI9.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													herramientas.sonidoCorto(sonidos);
													Pantalla.setVisible(false);
													paises.eliminarPorCarac("anguila");
													herramientas.paisElegido(paises.darPais());
													sonidos.close();
														}
											});
											//SI DICE QUE NO A LA PREGUNTA 9
											botonNO9.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													herramientas.sonidoCorto(sonidos);
													Pantalla.setVisible(false);
													paises.eliminarSiCumpleLaCaracteristica("anguila");
													herramientas.paisElegido(paises.darPais());
													sonidos.close();
												}
											});
											//SI DICE NOSE PREGUNTA 9
											botonNOSE9.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													herramientas.sonidoCorto(sonidos);
													Pantalla.setVisible(false);
													sonidos.close();
													herramientas.usuarioSinIdea(Pantalla);
												}
									});
												}
											});
											}
									});
				}
			});
			}
			});
				}
	}
