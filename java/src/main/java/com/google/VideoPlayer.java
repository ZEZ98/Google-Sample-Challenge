package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size()); }


  public void showAllVideos() {
    ArrayList<Video> videos_List = new ArrayList<Video>(videoLibrary.getVideos());

    System.out.println("Here's a list of all available videos:");
    //Collections.replaceAll(video.get, ",", "");
      String x = null;
      videos_List.sort(Comparator.comparing(Video::getTitle));
      videos_List.forEach(System.out::println);
      }



  public void playVideo(String videoId) {

    ArrayList<String> arr = new ArrayList<String>();
    if (arr.size() > 0) {
      System.out.println("Stopping video: " + arr.get(0));
      arr.remove(0);
      arr.add(videoLibrary.getVideo(videoId).getTitle());
    } else {
      arr.add(videoLibrary.getVideo(videoId).getTitle());
      System.out.println("Playing video: " + videoLibrary.getVideo(videoId).getTitle());
    }
  }

  public void stopVideo() {
    ArrayList<String> arr = new ArrayList<String>();
      String videoId = videoLibrary.getVideos().get(0).getVideoId();
      Video video = videoLibrary.getVideo(videoId);
     if(video != null){
      System.out.println("Stopping video: " + video.getTitle());
      video = null;
    } else{
      System.out.println("Cannot stop video: No video is currently playing");
    }
  }



  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}