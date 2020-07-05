package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

@WebServlet( "/BeerSelect" )
public class BeerSelect extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings( "rawtypes" )
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {

        // First version

        // response.setContentType( "text/html" );
        // PrintWriter out = response.getWriter();
        // out.println( "Beer Selection Advice<br>" );
        // String c = request.getParameter( "color" );
        // out.println( "<br>Got beer color " + c );

        // Second version

        // String c = request.getParameter( "color" );
        // BeerExpert be = new BeerExpert();
        // List result = be.getBrands( c );
        //
        // response.setContentType( "text/html" );
        // PrintWriter out = response.getWriter();
        // out.println( "Beer Selection Advice<br>" );
        //
        // Iterator it = (Iterator) result.iterator();
        // while ( it.hasNext() ) {
        // System.out.println( ( "try: " + it.next() ) );
        // }

        // Third version

        String c = request.getParameter( "color" );
        BeerExpert be = new BeerExpert();
        List result = be.getBrands( c );

        request.setAttribute( "styles", result );

        RequestDispatcher view = request.getRequestDispatcher( "result.jsp" );

        view.forward( request, response );
    }

    @SuppressWarnings( "rawtypes" )
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {

        // First version

        // response.setContentType( "text/html" );
        // PrintWriter out = response.getWriter();
        // out.println( "Beer Selection Advice<br>" );
        // String c = request.getParameter( "color" );
        // out.println( "<br>Got beer color " + c );

        // Second version

        // String c = request.getParameter( "color" );
        // BeerExpert be = new BeerExpert();
        // List result = be.getBrands( c );
        //
        // response.setContentType( "text/html" );
        // PrintWriter out = response.getWriter();
        // out.println( "Beer Selection Advice<br>" );
        //
        // Iterator it = (Iterator) result.iterator();
        // while ( it.hasNext() ) {
        // System.out.println( ( "try: " + it.next() ) );
        // }

        // Third version

        String c = request.getParameter( "color" );
        BeerExpert be = new BeerExpert();
        List result = be.getBrands( c );

        request.setAttribute( "styles", result );

        request.getRequestDispatcher( "result.jsp" ).forward( request, response );

    }
}
