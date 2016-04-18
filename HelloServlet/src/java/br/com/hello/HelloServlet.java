package br.com.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author https://javaes.wordpress.com/
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String matricula = req.getParameter("matricula");

        resp.getWriter().print("Método Get : Nome: " + nome + " Matricula: " + matricula);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String matricula = req.getParameter("matricula");

        resp.getWriter().print("Método Post : Nome: " + nome + " Matricula: " + matricula);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String matricula = req.getParameter("matricula");

        resp.getWriter().print("Método Put : Nome: " + nome + " Matricula: " + matricula);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        resp.getWriter().print("Método Delete : ID: " + id);
    }

}
