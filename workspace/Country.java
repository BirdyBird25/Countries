//Author: Buket Guner
//Date created: 1/14/25
//Description: This country class provides the instance variables, constructors, getters, setters, and toString method to help support the country game
//and help connect the information to the image files. and lay the foundation for the game.


public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  String name;
  String capital;
  String language;
  String imageFile;


  // add constructors

  public Country(String name2, String capital2, String language2, String imageFile2) {
    name = name2;
    capital = capital2;
    language = language2;
    imageFile = imageFile2;
  }

  public Country() {
  }

  // Write accessor/get methods for each instance variable that returns it.

  public String getName() {
    return name;
  }

  public String getCapital() {
    return capital;
  }

  public String getLanguage() {
    return language;
  }

  public String getImageFile() {
    return imageFile;
  }

  public void setName(String countryName) {
    name = countryName;
  }

  public void setCapital(String countryCapital) {
    capital = countryCapital;
  }

  public void setLanguage(String countryLanguage) {
    language = countryLanguage;
  }

  public void setImageFile(String countryImageFile) {
    imageFile = countryImageFile;
  }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
  public String toString() {
    return name + "'s capital is " + capital + " and it's primary language is " + language;
  }


  
}