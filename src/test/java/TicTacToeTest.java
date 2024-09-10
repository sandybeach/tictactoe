import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {

  @Test
  public void a_new_game_is_not_over() {
    TicTacToe newGame = new TicTacToe();

    assertThat(newGame.isOver()).isFalse();
  }

  @Test
  void a_game_is_over_when_all_fields_in_a_column_are_taken_by_player_X() {
    /**
     * +---+---+---+
     * | X | O | O |
     * +---+---+---+
     * | X | 5 | 6 |
     * +---+---+---+
     * | X | 8 | 9 |
     * +---+---+---+
     */
    TicTacToe game = new TicTacToe(
        "X", "O", "O",
        "X", "", "",
        "X", "", "");

    assertThat(game.isOver()).isTrue();
    assertThat(game.getWinner()).isEqualTo("X");
  }

  @Test
  void a_game_is_over_when_all_fields_in_a_column_are_taken_by_player_O() {
    TicTacToe game = new TicTacToe(
            "O", "X", "X",
            "O", "X", "",
            "O", "", "");

    assertThat(game.isOver()).isTrue();
    assertThat(game.getWinner()).isEqualTo("O");
  }


  /*
   * -1 player take 1 column => win
   * -1 player take 1 row => win
   * -1 player take 1 diagonale => win
   * -1 player can't play twice in a row
   * -1 player can't play on an unavailable case
   * -when grid is full, but no player has won => draw
   */

}
