package th.mfu;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calbmi")
public class BMICalculatorServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the weight and height parameters from the request
        String weightStr = request.getParameter("weight");
        String heightStr = request.getParameter("height");

        // Convert the weight and height strings to doubles
        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr);

        // Calculate the BMI
        double bmi = weight / (height * height);

        // Determine the built from BMI
        String built ;
        if (bmi < 18.5) {
            built = "underweight";
        } else if (bmi < 25) {
            built = "normal";
        } else if (bmi < 30) {
            built = "overweight";
        } else if (bmi < 35){
            built =  "obese";
        } 
        else {
            built = "extremely obese";
        }

        // Add the BMI and built to the request's attributes
        request.setAttribute("BMI", bmi);
        request.setAttribute("built", built);

        // Forward to the jsp
        request.getRequestDispatcher("bmi_result.jsp").forward(request, response);
    }
}
