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

    //HashMaps
    public ArrayList<QuestionModel> listaPreguntasCodigo = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasDeportes = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasEmpresa = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasGeografia = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasHistoria = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasMusica = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasPeliculas = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasPersonajesPublicos = new ArrayList();
    public ArrayList<QuestionModel> listaPreguntasTelefonia = new ArrayList();
    //public HashMap<Integer, QuestionModel> listaPreguntasCodigo = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasDeportes = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasEmpresa = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasGeografia = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasHistoria = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasMusica = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasPeliculas = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasPersonajesPublicos = null;
    //public HashMap<Integer, QuestionModel> listaPreguntasTelefonia = null;

    public QuestionModel auxQuestions;
    public String[] listAnswers = new String[3];
    public int round = 1;

    public void preguntasCodigo() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Codigo.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasCodigo.add(auxQuestions);
            }
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
    }

    public void preguntasDeportes() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Deportes.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasDeportes.add(auxQuestions);

            }
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
    }

    public void preguntasEmpresa() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Empresa.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasEmpresa.add(auxQuestions);

            }
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
    }

    public void preguntasGeografia() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Geografia.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasGeografia.add(auxQuestions);

            }
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
    }

    public void preguntasHistoria() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Historia.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasHistoria.add(auxQuestions);

            }
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
    }

    public void preguntasMusica() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Musica.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasMusica.add(auxQuestions);

            }
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
    }

    public void preguntasPeliculas() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Peliculas.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasPeliculas.add(auxQuestions);

            }
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
    }

    public void preguntasPersonajesPublicos() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("PersonajesPublicos.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasPersonajesPublicos.add(auxQuestions);

            }
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
    }

    public void preguntasTelefonia() {

        BufferedReader br = null;

        try {

            String[] valores;

            br = new BufferedReader(new FileReader("Telefonia.txt"));

            String linea = br.readLine();
            while (linea != null) {

                valores = linea.split(";");

                linea = br.readLine();

                listAnswers[0] = valores[3];
                listAnswers[1] = valores[4];
                listAnswers[2] = valores[5];

                auxQuestions = new QuestionModel(Integer.parseInt(valores[0]), valores[1],
                        Integer.parseInt(valores[2]), listAnswers, Integer.parseInt(valores[6]));

                listaPreguntasTelefonia.add(auxQuestions);

            }
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
    }
}
