// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 9/20/2008 8:26:15 PM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Class23.java

import java.io.PrintStream;

public class Class23
{

    public static void method264(int i, Class44 class44)
    {
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("spotanim.dat", null), 891);
        if(i != 0)
            aBoolean401 = !aBoolean401;
        byte byte0 = 6;
        anInt402 = class30_sub2_sub2.method410() + byte0;
        if(aClass23Array403 == null)
            aClass23Array403 = new Class23[anInt402];
        for(int j = 0; j < anInt402; j++)
        {
            if(aClass23Array403[j] == null)
                aClass23Array403[j] = new Class23();
            aClass23Array403[j].anInt404 = j;
            char c = '\uFFFF';
            Class23 class23 = aClass23Array403[j];
            switch(j)
            {
            case 643: 
                c = '\007';
                class23.anInt405 = 2391;
                break;

            case 644: 
                c = '\u011A';
                class23.anInt405 = 8223;
                break;

            case 654: 
                c = '\u011A';
                class23.anInt405 = 8211;
                break;

            case 648: 
                c = '\u011A';
                class23.anInt405 = 8203;
                break;

            case 655: 
                c = '\u011A';
                class23.anInt405 = 2849;
                break;

            case 656: 
                c = '\u011A';
                class23.anInt405 = 16828;
                break;

            case 657: 
                c = '\u0162';
                class23.anInt405 = 12411;
                break;

            case 611: 
                c = '\002';
                class23.anInt405 = 10113;
                break;
            case 500: 
                c = '\002';
                class23.anInt405 = 10500;
                break;

            default:
                c = '\uFFFF';
                break;
            }
            if(c != '\uFFFF')
            {
                class23.anInt406 = aClass23Array403[c].anInt406;
                if(Class20.aClass20Array351 != null)
                    class23.aClass20_407 = Class20.aClass20Array351[class23.anInt406];
                class23.anInt410 = aClass23Array403[c].anInt410;
                class23.anInt411 = aClass23Array403[c].anInt411;
                class23.anInt412 = aClass23Array403[c].anInt412;
                class23.anInt413 = aClass23Array403[c].anInt413;
                class23.anInt414 = aClass23Array403[c].anInt414;
                class23.anIntArray408 = aClass23Array403[c].anIntArray408;
                class23.anIntArray409 = aClass23Array403[c].anIntArray409;
            } else
            {
                class23.method265(true, class30_sub2_sub2);
            }
        }

    }

    public void method265(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                return;
            if(i == 1)
                anInt405 = class30_sub2_sub2.method410();
            else
            if(i == 2)
            {
                anInt406 = class30_sub2_sub2.method410();
                if(Class20.aClass20Array351 != null)
                    aClass20_407 = Class20.aClass20Array351[anInt406];
            } else
            if(i == 4)
                anInt410 = class30_sub2_sub2.method410();
            else
            if(i == 5)
                anInt411 = class30_sub2_sub2.method410();
            else
            if(i == 6)
                anInt412 = class30_sub2_sub2.method410();
            else
            if(i == 7)
                anInt413 = class30_sub2_sub2.method408();
            else
            if(i == 8)
                anInt414 = class30_sub2_sub2.method408();
            else
            if(i >= 40 && i < 50)
                anIntArray408[i - 40] = class30_sub2_sub2.method410();
            else
            if(i >= 50 && i < 60)
                anIntArray409[i - 50] = class30_sub2_sub2.method410();
            else
                System.out.println((new StringBuilder()).append("Error unrecognised spotanim config code: ").append(i).toString());
        } while(true);
    }

    public Class30_Sub2_Sub4_Sub6 method266()
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_415.method222(anInt404);
        if(class30_sub2_sub4_sub6 != null)
            return class30_sub2_sub4_sub6;
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt400, anInt405);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(anIntArray408[0] != 0)
                class30_sub2_sub4_sub6.method476(anIntArray408[i], anIntArray409[i]);

        aClass12_415.method223(class30_sub2_sub4_sub6, anInt404, (byte)2);
        return class30_sub2_sub4_sub6;
    }

    public Class23()
    {
        anInt400 = 9;
        anInt406 = -1;
        anIntArray408 = new int[6];
        anIntArray409 = new int[6];
        anInt410 = 128;
        anInt411 = 128;
    }

    private int anInt400;
    private static boolean aBoolean401 = true;
    public static int anInt402;
    public static Class23 aClass23Array403[];
    public int anInt404;
    public int anInt405;
    public int anInt406;
    public Class20 aClass20_407;
    public int anIntArray408[];
    public int anIntArray409[];
    public int anInt410;
    public int anInt411;
    public int anInt412;
    public int anInt413;
    public int anInt414;
    public static Class12 aClass12_415 = new Class12(false, 30);

}