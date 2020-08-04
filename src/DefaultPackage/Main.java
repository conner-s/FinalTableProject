 /**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 DefaultPackage.DefaultPackage.Main class.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package DefaultPackage;

import Controller.Controller;
import Model.Model;
import View.View;

 public class Main {

     public static void main(String[] args) {
         View view = new View();
         Model model = new Model();
         Controller controller = new Controller(view, model);
     }
 }
