/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.controller;

import com.miempresa.dao.PreguntaDao;
import com.miempresa.dtos.PreguntaDto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo1
 */
public class PreguntaController extends HttpServlet {
    PreguntaDao dao = new PreguntaDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("txtAccionp");

        if (accion.equals("listp")) {
            PreguntaDao preguntaDao = new PreguntaDao();
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/listpreguntas.jsp").forward(request, response);
        } else if (accion.equals("newp")) {
            String anio = request.getParameter("txtAnio");
            String bimestre = request.getParameter("txtBimestre");
            String curso = request.getParameter("txtCurso");
            String dificultad = request.getParameter("txtDificultad");
            String pregunta = request.getParameter("txtPregunta");
            PreguntaDto preguntaDto = new PreguntaDto(anio, bimestre, curso, dificultad, pregunta);
            PreguntaDao preguntaDao = new PreguntaDao();
            preguntaDao.sql_insert(preguntaDto);
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/newpreguntas.jsp").forward(request, response);
        } /*else if(accion.equals("buscar")){
            String dato=request.getParameter("txtBusca");
            List<PreguntaDto> lista = dao.buscar(dato);
            request.setAttribute("preguntas", lista);
            request.getRequestDispatcher("mproductos/listpreguntas.jsp").forward(request, response);
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
