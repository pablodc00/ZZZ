package com.dummy.work;



import javax.crypto.Cipher;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class AppRSA {

    public static void main(String[] args) throws Exception {

        System.out.println("Crear clave pública y privada");
        //Creación y obtención del par de claves
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(512);//tamaño de la clave
        KeyPair clavesRSA = keyGen.generateKeyPair();

        //Clave privada
        PrivateKey clavePrivada = clavesRSA.getPrivate();

        //Clave pública
        PublicKey clavePublica = clavesRSA.getPublic();

        //Se pueden mostrar las claves para ver cuáles son, aunque esto no es aconsejable
        System.out.println("clavePublica: " + clavePublica);
        System.out.println("clavePrivada: " + clavePrivada);

        //Texto plano
        byte[] bufferClaro = "Este es el mensaje secreto\n".getBytes();

        //Ciframos con clave pública el texto plano utilizando RSA
        Cipher cifrador = Cipher.getInstance("RSA");
        cifrador.init(Cipher.ENCRYPT_MODE, clavePublica);
        System.out.println("Cifrar con clave pública el Texto:");
        mostrarBytes(bufferClaro);

        //Realización del cifrado del texto plano
        byte[] bufferCifrado = cifrador.doFinal(bufferClaro);
        System.out.println("Texto CIFRADO");
        mostrarBytes(bufferCifrado);
        System.out.println("\n_______________________________");

        //Desencriptación utilizando la clave privada
        cifrador.init(Cipher.DECRYPT_MODE, clavePrivada);
        System.out.println("Descifrar con clave privada");

        //Obtener y mostrar texto descifrado
        bufferClaro = cifrador.doFinal(bufferCifrado);
        System.out.println("Texto DESCIFRADO");
        mostrarBytes(bufferClaro);
        System.out.println("\n_______________________________");
    }

    public static void mostrarBytes(byte[] buffer) throws IOException {
        System.out.write(buffer);
    }
}
