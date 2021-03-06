/*
 * Copyright (c) 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.temp.iterator;

import java.util.List;
import java.util.ListIterator;

/**
 * @author devonline
 * @link http://devonline.academy/javamm
 */
@SuppressWarnings("CheckStyle")
public final class Example03 {

    private Example03() {
    }

    public static void main(final String[] args) {
        final List<Integer> values = List.of(0, 1, 2, 3, 4);
        final ListIterator<Integer> iterator = values.listIterator();
        simpleIteration(iterator);
        complexIteration(iterator);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void simpleIteration(final ListIterator<Integer> iterator) {
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void complexIteration(final ListIterator<Integer> iterator) {
        while (iterator.hasNext()) {
            final Integer value = iterator.next();
            System.out.println(value);
            if (value == 3) {
                iterator.previous();
                break;
            }
        }
    }
}
