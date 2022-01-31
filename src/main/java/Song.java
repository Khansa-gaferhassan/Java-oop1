/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class Song {
    String title;
    double duration;
     public Song(String title ,double duration){
         this.title= title;
         this.duration=duration;
     }
     
    public Song(){
}
    public  String getTitle(){ 
        return title;
    }
    public double getDuration(){
    return duration ;
    }
    @Override
     public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}