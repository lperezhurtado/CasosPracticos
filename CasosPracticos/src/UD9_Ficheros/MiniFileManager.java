
package UD9_Ficheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MiniFileManager {
    
    private String ruta;
    private File fichero;
    private File aux;
    
    //Constructor
    public MiniFileManager(String raiz){
        ruta = raiz;
        fichero = new File(ruta);
    }
    //PWD
    public String getPWD(){
        
        return fichero.getAbsolutePath();
    }
    
    //CD Dir
    public boolean changeDir(String dir){
        
        if(dir.equals("..")){
            ruta = fichero.getParent();
            fichero = new File(ruta);
            return true;
        }
        
        else if(!"..".equals(dir)){
            aux = new File(fichero.getAbsolutePath()+dir);
            
            if(aux.exists()){
                ruta = aux.getAbsolutePath();
                fichero = new File(ruta);
                System.out.println("SE HA CAMBIADO ");
            
            }
            return true;
        }
        
        else{
            return false;
        }
        
    }
    //listas
    public void mostrarLista(boolean info){
        
        File[] lista = fichero.listFiles();
        Arrays.sort(lista);
        ArrayList <File> dir = new ArrayList();
        ArrayList <File> arch = new ArrayList();
        Date fecha;
        
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].isDirectory()){
                dir.add(lista[i]);
            }
            else{
                arch.add(lista[i]);
            }  
        }
        
        if(info){
            System.out.println("LISTA DE DIRECTORIOS \t");
            for (int i = 0; i < dir.size(); i++) {
                System.out.print(dir.get(i).getName());
                System.out.print("   "+dir.get(i).length()+"   ");
                System.out.print(fecha = new Date(dir.get(i).lastModified()));
                System.out.println("\t");
            }
            
            System.out.println("\n");
            System.out.println("LISTA DE ARCHIVOS \t");
            for (int i = 0; i < arch.size(); i++) {
                System.out.print(arch.get(i).getName());
                System.out.print("   "+arch.get(i).length()+"   ");
                System.out.print(fecha = new Date(arch.get(i).lastModified()));
                System.out.println("\t");
            }
            System.out.print("\n");
        }
        
        
        else if(!info){
            System.out.println("LISTA DE DIRECTORIOS \t");
            for (int i = 0; i < dir.size(); i++) {
                System.out.println(dir.get(i).getName());
            }
            
            System.out.print("\n");
            System.out.println("LISTA DE ARCHIVOS \t");
            for (int i = 0; i < arch.size(); i++) {
                System.out.println(arch.get(i).getName());
            }
            System.out.print("\n");
        }
    }
    //Crear Directorios
    public boolean crearDir(String dir){
        fichero = new File(fichero.getAbsolutePath()+File.separator+dir);
        boolean mkDir = fichero.mkdir();
        return mkDir;
    }
    //Borrar
    public boolean borrar(String archivo){
        aux = new File(archivo);
        File[] lista = aux.listFiles();
        
        boolean delArchivo = aux.delete();
        
        if(delArchivo && aux.isFile()){
            return delArchivo;
        }
        
        else if(!delArchivo && aux.isDirectory()){
            ArrayList<File> dir = new ArrayList();
            ArrayList<File> arch = new ArrayList();
            
            for (int i = 0; i < lista.length; i++) {
                if(lista[i].isFile()){
                    arch.add(lista[i]);
                }
                else{
                    dir.add(lista[i]);
                }
            }
            
            for (int i = 0; i < arch.size(); i++) {
                arch.get(i).delete();
            }
            
            delArchivo = aux.delete();
            return delArchivo;
        }
        else{
            System.out.println("Hay subcarpetas");
            return false;
        }
    }
    //Mover o renombrar Directorios
    public boolean moverDir(String file1, String file2){
        aux = new File(file1);
        File aux2 = new File(file2);
        boolean mv = aux.renameTo(aux2);
        
        if(aux.exists() && mv == true){
            return mv;
        }
        else{
            return mv;
        }
    }
    //Help
    public void help(){
        System.out.println("● pwd: Muestra cual es la carpeta actual.\n" +
            "● cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.\n" +
            "● ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego\n" +
            "archivos, ambos ordenados alfabéticamente).\n" +
            "● ll: Como ls pero muestra también el tamaño y la fecha de última modificación.\n" +
            "● mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.\n" +
            "● rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si\n" +
            "tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.\n" +
            "● mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.\n" +
            "● help: Muestra una breve ayuda con los comandos disponibles.\n" +
            "● exit: Termina el programa.");
    }
     
}
