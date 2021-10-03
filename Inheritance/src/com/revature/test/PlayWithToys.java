package com.revature.test;

import com.revature.model.Doll;
import com.revature.model.ActionFigure;

public class PlayWithToys {
   public static void main(String[] args) {
      Doll doll = new Doll("Annabelle","blue");
      System.out.println("Our doll "+doll.getName()
                    +" has "+doll.getEyeColor()+" eyes.");
      doll.play();
      doll.makeTalk();
      
      ActionFigure af = new ActionFigure("Barry Allan", "blue", "speed");
      System.out.println("Our action figure " + af.getName() + " has " + af.getEyeColor() + " eyes and " + af.getSkill() + " skill.");
      af.play();
      af.makeTalk();
      af.useSkill();
   }
}
