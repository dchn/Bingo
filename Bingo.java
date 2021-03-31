import java.util.ArrayList;

public class Bingo {
  ArrayList<Integer> board = new ArrayList <Integer> ();



public Bingo(){

ArrayList <Integer> List1 = new ArrayList <Integer> ();
ArrayList <Integer> List2 = new ArrayList <Integer> ();
ArrayList <Integer> List3 = new ArrayList <Integer> ();
ArrayList <Integer> List4 = new ArrayList <Integer> ();
ArrayList <Integer> List5 = new ArrayList <Integer> ();


  for (int b = 0; b < 15; b++) {
      List1.add(b, b + 1);

  }

  for (int i = 0; i < 15 ; i++) {
      List2.add(i, i + 16);

  }

  for (int n = 0; n < 15; n++) {
      List3.add(n, n + 31);

  }

    for (int g = 0; g < 15; g++) {
      List4.add(g, g + 46);

  }

  for (int o = 0; o < 15; o++) {
      List5.add(o, o + 61);

  }

for(int index = 0; index < 25; index++){
if (index < 5){
 int x = (int)(Math.random()*List1.size());
board.add(index, List1.get(x));
List1.remove(x);
  }
  else if (index < 10)
  {
 int x = (int)(Math.random()*List2.size());
board.add(index, List2.get(x));
List2.remove(x);
  }
  else if (index < 15)
  {
     int x = (int)(Math.random()*List3.size());
board.add(index, List3.get(x));
List3.remove(x);
  }
  else if(index < 20)
  {
     int x = (int)(Math.random()*List4.size());
board.add(index, List4.get(x));
List4.remove(x);
  }
  else if(index < 25)
  {
     int x = (int)(Math.random()*List5.size());
board.add(index, List5.get(x));
List5.remove(x);
  }
  }

}

public String toString(){
  String visualB = "B" + "\t" + "I" + "\t" + "N" + "\t" + "G" + "\t" + "O" + "\n";
  for (int b = 0; b < 5; b++){
    for (int j = b; j < 25; j += 5){
      visualB += board.get(j);
        if(j + 5 < 25){
        visualB += "\t";

}

    }
    visualB += "\n";
  }
  return visualB;
}

public String getBoard(){
  return board.toString();
}

}


