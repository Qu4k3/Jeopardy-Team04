/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class LoadModel {

    public int round = 1;
    public String[] listAnswers = new String[3];
    public QuestionModel auxQuestions;

    public HashMap<String, ArrayList<QuestionModel>> CargarDatos() {

        BufferedReader br = null;
        QuestionModel auxQuestions;
        ArrayList<QuestionModel> listaPreguntasCodigo = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasDeportes = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasEmpresa = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasGeografia = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasHistoria = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasMusica = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasPeliculas = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasPersonajesPublicos = new ArrayList();
        ArrayList<QuestionModel> listaPreguntasTelefonia = new ArrayList();
        HashMap<String, ArrayList<QuestionModel>> listaTodasPreguntas = new HashMap<>();

        String[] listAnswers;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Codigo.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasCodigo.add(auxQuestions);

                linea = br.readLine();
            }
            listaTodasPreguntas.put("codigo", listaPreguntasCodigo);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Deportes.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasDeportes.add(auxQuestions);

                linea = br.readLine();
            }
            listaTodasPreguntas.put("deportes", listaPreguntasDeportes);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Empresa.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasEmpresa.add(auxQuestions);

                linea = br.readLine();
            }

            listaTodasPreguntas.put("empresa", listaPreguntasEmpresa);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Geografia.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasGeografia.add(auxQuestions);

                linea = br.readLine();
            }
            listaTodasPreguntas.put("geografia", listaPreguntasGeografia);

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Historia.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasHistoria.add(auxQuestions);

                linea = br.readLine();
            }
            listaTodasPreguntas.put("historia", listaPreguntasHistoria);

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Musica.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasMusica.add(auxQuestions);

                linea = br.readLine();
            }
            listaTodasPreguntas.put("musica", listaPreguntasMusica);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Peliculas.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasPeliculas.add(auxQuestions);

                linea = br.readLine();
            }
            listaTodasPreguntas.put("peliculas", listaPreguntasPeliculas);

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("PersonajesPublicos.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasPersonajesPublicos.add(auxQuestions);

                linea = br.readLine();
            }

            listaTodasPreguntas.put("personajesPublicos", listaPreguntasPersonajesPublicos);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Telefonia.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                listAnswers = new String[3];

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasTelefonia.add(auxQuestions);

                linea = br.readLine();
            }

            listaTodasPreguntas.put("telefonia", listaPreguntasTelefonia);

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("El archivo no se ha podido abrir");
            }
        }
        return listaTodasPreguntas;
    }
}
