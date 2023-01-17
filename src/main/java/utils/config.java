package utils;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;


public class config {

    private FileConfiguration fileConfiguration;
    private File file;

    public config(String name, File path){

        file = new File(path,name);
        if (!file.exists()){
            path.mkdir();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        fileConfiguration = new YamlConfiguration();
        try {
            fileConfiguration.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public File getFile(){
        return file;
    }

    public FileConfiguration tofileconfiguration(){
        return fileConfiguration;
    }

    public void save(){
        try {
            fileConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void reload(){

        try {
            fileConfiguration.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

}
