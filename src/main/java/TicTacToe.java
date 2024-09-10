import java.util.List;

public class TicTacToe {

  private List<String> cells;

  public TicTacToe(String string, String string2, String string3, String string4, String object, String object2,
      String string5, String object3, String object4) {
    this.cells = List.of(string, string2, string3, string4, object, object2, string5, object3, object4);
  }

  public TicTacToe() {
    this.cells = List.of("", "", "", "", "", "", "", "", "");
  }

  public Boolean isOver() {
    return cells.stream().filter(cell -> cell.equals("O")).count() > 0;
  }

  public String getWinner() {
    if (cells.stream().filter(cell -> cell.equals("O")).count() == 0) {
      return null;
    }

    return cells.stream().filter(cell -> cell.equals("X")).count() == cells.stream().filter(cell -> cell.equals("O"))
        .count() ? "O" : "X";
  }
}
