package dev.narektu.fairflow.scheduler;

import static org.assertj.core.api.Assertions.assertThat;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.junit.jupiter.api.Test;

class SmokeTest {

    @Test
    void junitRuns() {
        assertThat(1 + 1).isEqualTo(2);
    }

    @Property
    void jqwikRuns(@ForAll int a, @ForAll int b) {
        assertThat(a + b).isEqualTo(b + a);
    }
}
