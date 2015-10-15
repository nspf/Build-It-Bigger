/*
 * Copyright 2015 Nicolas Pintos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.udacity.jokes;

import java.util.Random;

public class Jokes {

    private final String[] mJokes = {

            "The truth is out there. Anybody got the URL?",

            "The box said \"Requires Windows Vista or better\". So I installed LINUX.",

            "Unix is user friendly. It\'s just selective about who its friends are.",

            "My software never has bugs. It just develops random features.",

            "I\'m not anti-social; I\'m just not user friendly.",

            "Programmers are tools for converting caffeine into code",

            "Enter any 11-digit prime number to continue",

            "E-mail returned to sender, insufficient voltage",

            "-\"Knock, knock.\"\n-\"Who\'s there?\"\n(very long pause)\n-\"Java.\" ",

            "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"",

            "To understand what recursion is, you must first understand recursion.",

            "The C language combines all the power of assembly language with all the ease-of-use of assembly language.",

            "Keyboard not found ... press F1 to continue ",

            "If Java is the answer, it must have been a really verbose question.",

            "In C we had to code our own bugs. In C++ we can inherit them",

            "There\'s a band called 1023MB. They haven\'t had any gigs yet."
    };

    public String getJoke() {
        int index = new Random().nextInt(mJokes.length);
        return mJokes[index];
    }
}

