import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()){
           if(validIndex(index)){
                String filename = files.get(index);
                System.out.println(filename);
            }
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            if(validIndex(index)){
                files.remove(index);
            }
        }
    }

    /**
     * Comprueba si el indice es valido
     */
    public void checkIndex(int index)
    {
        if (files.size() <= index){
            System.out.println("Indice no valido");
        }
    }
    
    /**
     * Devuelve si el indice es valido o no
     */
    public boolean validIndex(int index)
    {
        // Devuelve true si el indice es valido y devuelvo false si no lo es
        boolean validIndex = true;
        if (files.size() <= index)
        {
            validIndex = false;
        }
        else
        {
            validIndex = true;
        }
        return validIndex;
    }
    
}
