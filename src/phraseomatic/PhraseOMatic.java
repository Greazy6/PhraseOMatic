/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phraseomatic;

import javax.swing.JOptionPane;

public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Please enter your first and last name");
        JOptionPane.showMessageDialog(null, "Hello " + name + " Here is some corporate Jargon");
        
        
        String[] wordListOne = {
            "24/7", "multi-Tier", "30,000 foot", "B-To-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"
        };
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {
            "process", "tiping-point", "solution", "architecture", "core compentency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"
        };
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        JOptionPane.showMessageDialog(null, "What we need is " + phrase);
        
        int rand11 = (int) (Math.random() * oneLength);
        int rand22 = (int) (Math.random() * twoLength);
        int rand33 = (int) (Math.random() * threeLength);
        
        String phrase2 = wordListOne[rand11] + " " + wordListTwo[rand22] + " " + wordListThree[rand33];
        
    
        
        JOptionPane.showMessageDialog(null, "Wow that was amazing and here is some more " + phrase2);
    }
    
}
