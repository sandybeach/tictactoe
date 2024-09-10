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

  @Test
  void player_X_is_able_to_play_when_it_is_her_turn() {
    TicTacToe game = new TicTacToe(
        "X", "", "",
        "", "", "",
        "", "", "");

    assertThat(game.isOver()).isFalse();
    assertThat(game.getWinner()).isNull();
  }

  /*
   * - [x] player X wins with column 1
   * - [x] player O wins with column 1
   * - [ ] player X wins with column 2
   * - [ ] player O wins with column 2
   * - [ ] player X wins with column 3
   * - [ ] player O wins with column 3
   *
   * - [ ] player X wins with row 1
   * - [ ] player O wins with row 1
   * - [ ] player X wins with row 2
   * - [ ] player O wins with row 2
   * - [ ] player X wins with row 3
   * - [ ] player O wins with row 3
   *
   * - [ ] player X wins with diagonale 1
   * - [ ] player O wins with diagonale 1
   * - [ ] player X wins with diagonale 2
   * - [ ] player O wins with diagonale 2
   *
   * - [ ] a player can't play twice in a row
   * - [ ] a player can't play on an unavailable case
   *
   * - [ ] when grid is full, but no player has won => draw
   *
   * - [ ] player X is able to play when it is her turn
   * - [ ] player O is able to play when it is her turn
   */

}
