package org.sanvo.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by alan_007@foxmail.com on 2017/4/25.
 */

public class ServletLoad extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String path=request.getParameter("path_a");

       ImportExecl poi=new ImportExecl();
  /*
        List<List<String>> list = poi.read("g:\\"+path);
        int[] arr=new int[list.size()];
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print("第" + (i) + "行");
                List<String> cellList = list.get(i);
                for (int j = 0; j < cellList.size(); j++) {
                    // System.out.print("    第" + (j + 1) + "列值：");
                    System.out.print("    " + cellList.get(j));
                    arr[i]= (int) Double.parseDouble((cellList.get(j)));
                }
                System.out.println();
            }

        }
//        double[] arr = { 1, 3, 2, 4, 5, 6, 7, 8, 9 };
//        double[] arr = { 3171320,-6457700,5105144,-6853000,290356,-2945900 };
        Test test = new Test();
        test.getSubSet(arr, 3171320, 0);
*/
        System.out.print(path);
        System.out.print("d");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
