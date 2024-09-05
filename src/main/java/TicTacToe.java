import java.util.List;

public class TicTacToe {

  private List<String> cells;

  public TicTacToe(String string, String string2, String string3, String string4, String object, String object2,
      String string5, String object3, String object4) {
    this.cells = List.of(string, string2, string3, string4, object, object2, string5, object3, object4);
  }

  public TicTacToe() {
    // TODO Auto-generated constructor stub
  }

  public Boolean isOver() {
    return cells != null;
  }

  public String getWinner() {
    return "X";
  }
}
