package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void add_behave_as_expected() {
        int resultAdd = new Sample().op(Sample.Operation.ADD, 6,5);
        int resultMult = new Sample().op(Sample.Operation.MULT, 5,5);

        Assertions.assertThat(resultAdd).isEqualTo(11);
        Assertions.assertThat(resultMult).isEqualTo(25);

    }

}
