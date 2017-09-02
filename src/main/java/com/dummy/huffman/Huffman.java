package com.dummy.huffman;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Huffman {

    public int[] getFrecuencias(File file) throws IOException {
        int[] frecuencias = new int[257];
        InputStream input = new BufferedInputStream(new FileInputStream(file));
        try {
            while (true) {
                int b = input.read();
                if (b == -1) {
                    break;
                }
                frecuencias[b]++;
            }
        } finally {
            input.close();
        }
        return frecuencias;
    }
}
