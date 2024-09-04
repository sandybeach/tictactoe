import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {

    @Test
    public void a_new_game_is_not_over() {
        TicTacToe newGame = new TicTacToe();

        assertThat(newGame.isOver()).isFalse() ;
    }

    /*
    -1 player take 1 column
    -1 player take 1 row
    -1 player take 1 diagonale
    -1 player can't play twice in a row
    -1 player can't play on an unavailable case
     */

}
