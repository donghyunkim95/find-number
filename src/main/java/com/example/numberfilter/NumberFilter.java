package com.example.numberfilter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet (name = "NumberFilter", value ="/find-number")
public class NumberFilter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("숫자 찾기");
        // 문자열에서 숫자만 추출 : https://onggun.tistory.com/349

        String str = req.getParameter("input");
        String restr = str.replaceAll("[^0-9]","");
        out.print (restr);


    }
}
