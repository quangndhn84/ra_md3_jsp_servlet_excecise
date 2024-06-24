package ra.jsp_servlet_execise.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CaculatorServlet", value = "/CaculatorServlet")
public class CaculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. Lấy dữ liệu trên form
        float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
        float secondOrerand = Float.parseFloat(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        //2. Tính toán ra kết quả
        float result;
        String operatorStr;
        switch (operator) {
            case "add":
                result = firstOperand + secondOrerand;
                operatorStr = "+";
                break;
            case "minus":
                result = firstOperand - secondOrerand;
                operatorStr = "-";
                break;
            case "div":
                result = firstOperand / secondOrerand;
                operatorStr = ":";
                break;
            case "multi":
                result = firstOperand * secondOrerand;
                operatorStr = "x";
                break;
            default:
                result = firstOperand % secondOrerand;
                operatorStr = "%";
                break;
        }

        //3. add result vào request
        request.setAttribute("result", result);
        request.setAttribute("firstOperand",firstOperand);
        request.setAttribute("secondOperand",secondOrerand);
        request.setAttribute("operator",operatorStr);
        //4. Chuyển sang trang hiển thị kết quả
        request.getRequestDispatcher("views/result.jsp").forward(request, response);


    }
}