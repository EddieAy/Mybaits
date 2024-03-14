package zera.bank.web;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import zera.bank.exceptions.MoneyNotEnoughException;
import zera.bank.exceptions.TransferFailException;
import zera.bank.service.AccountService;
import zera.bank.service.impl.AccountServiceImpl;

import java.io.IOException;

@WebServlet("/transfer")
public class AccoutServlet extends HttpServlet {

    private AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Get data
        String fromActNum = request.getParameter("fromActNum");
        String toActNum = request.getParameter("toActNum");
        double money = Double.parseDouble(request.getParameter("money"));

        //Invoke service
        try {
            accountService.transfer(fromActNum,toActNum,money);
            response.sendRedirect(request.getContextPath() + "/success.html");
        } catch (MoneyNotEnoughException e) {
            response.sendRedirect(request.getContextPath() + "/error.html");

        } catch (TransferFailException e) {
            response.sendRedirect(request.getContextPath() + "/error.html");

        } catch (Exception e){
            response.sendRedirect(request.getContextPath() + "/error.html");
        }


    }

}
