package com.company;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Animator implements Runnable {

    Graphics G;
    ArrayList<Dot> L = new ArrayList();
    Polynom P;
    ArrayList<Polynom> LP = new ArrayList();

    public Animator(Graphics G, ArrayList<Dot> L) {
        this.G = G;
        this.L = L;
    }

    public void getPolynom(Polynom P) {
        this.P = P;
        LP.add(P);
    }

    public void Draw() {
        G.setColor(Color.black);
        G.drawLine(20, 250, 470, 250); // X
        G.drawLine(240, 20, 240, 370); // Y
        G.drawString("x", 460, 270);
        G.drawString("y", 254, 35);
        G.setColor(Color.lightGray);
        int i = 10;
        int j = 10;
        while (i <= 480) {
            G.drawLine(i, 253, i, 247);
            i += 10;
        }
        while (j <= 380) {
            if (j != 250) {
                G.drawLine(237, j, 243, j);
            }
            j += 10;
        }
        G.setColor(Color.black);
    }

    public void DrawPoint(int n) {
        G.setColor(Color.red);
        G.fillOval(TransformX(L.get(n)) - 3, TransformY(L.get(n)) - 3, 4, 4);
        G.setColor(Color.black);
    }

    public int TransformX(Dot dot) {
        int x = (int) (dot.x * 10 + 240);
        return x;
    }

    public int TransformY(Dot dot) {
        int y = (int) (250 - dot.y * 10);
        return y;
    }

    @Override
    public void run() {
        if (LP.size() > 2) {
            Polynom P1;
            P1 = LP.get(LP.size() - 1);
            double x1 = -24;
            Random r = new Random();
            Color C = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
            G.setColor(C);
            for (int i = 0; i <= 5000; i++) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                x1 += 0.01;
                double y1 = P1.pointValue(x1);
                Dot dot1 = new Dot(x1, y1);
                G.setColor(C);
                G.fillOval(TransformX(dot1), TransformY(dot1), 1, 1);
            }
            G.setColor(Color.black);
        }

    }
}

