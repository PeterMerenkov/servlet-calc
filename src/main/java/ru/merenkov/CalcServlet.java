package ru.merenkov;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operator = req.getParameter("operator");

        req.setAttribute("num1", num1);
        req.setAttribute("num2", num2);
        req.setAttribute("operator", operator);

        switch (operator) {
            case "+" -> req.setAttribute("result", num1 + num2);
            case "-" -> req.setAttribute("result", num1 - num2);
            case "x" -> req.setAttribute("result", num1 * num2);
            case "/" -> {
                if (num2 == 0) req.setAttribute("result", "Недопустимая операция");
                else req.setAttribute("result", (float) num1 / num2);
            }
        }

        req.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(req, resp);
    }
}
