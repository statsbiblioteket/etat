/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package dk.kb.etat;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 *
 */
public class Pyramid {
    private static Log log = LogFactory.getLog(Pyramid.class);

    // Single image size limitation: 4bx4b
    public static final int O_WIDTH = 0;                    // uint
    public static final int O_HEIGHT = O_WIDTH + 4;         // uint
    public static final int O_AVERAGE_COLOR = O_HEIGHT + 4; // RGB
    public static final int O_TILE_START = O_AVERAGE_COLOR + 3;

    public get

}

