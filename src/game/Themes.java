/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;

/**
 *
 * @author user1
 */
public class Themes {
    private int themeId;
    private String title;
    private Color color1;
    private Color color2;
    private String queenColor;

    public Themes(String title, Color color1, Color color2, String queenColor) {
        this.title = title;
        this.color1 = color1;
        this.color2 = color2;
        this.queenColor = queenColor;
    }

    public Themes(String title) {
        this.title = title;
    }
            
    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public String getQueenColor() {
        return queenColor;
    }

    public void setQueenColor(String queenColor) {
        this.queenColor = queenColor;
    }
    
    public void applyTheme(){
        //
    }
}
