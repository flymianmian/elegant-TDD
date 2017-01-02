package org.thoughtworks.linesh.multicurrencymoney;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import support.Tasking;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Tasking
    @Nested
    class should_test_multiplications {
        @Test
        void should_get_10_dollars_when_multiple_2_with_5() {
            Dollar five = new Dollar(5);

            assertEquals(new Dollar(10), five.times(2));
        }

        @Test
        void should_get_15_dollars_when_multiple_3_with_5() {
            Dollar five = new Dollar(5);

        }
    }

    @Tasking @Nested
    class should_test_equality {
        @Test
        void should_5_dollars_equals_to_5_dollars() {
            assertTrue(new Dollar(5).equals(new Dollar(5)));
        }

        @Test
        void should_5_dollars_not_equals_to_6_dollars() {
            assertFalse(new Dollar(5).equals(new Dollar(6)));
        }
    }
    @Tasking
    @Nested
    class should_add_two_different_kinds_of_currency_given_exchange_rate {
        
    }

}