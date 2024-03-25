/*
 * Copyright (c) 2024 Karlsruhe Institute of Technology.
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

package de.dhbwka.tinf21b1.advancedSWE.easyChat.domain;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Message {
    private final UUID uuid;
    private final String text;
    private final ZonedDateTime sentAt;
    private final User author;

    public Message(String text, User author) {
        this.uuid = UUID.randomUUID();
        this.sentAt = ZonedDateTime.now(author.getTimeZone());
        this.text = text;
        this.author = author;
    }

    public UUID getUUID() {
        return uuid;
    }

    public ZonedDateTime getSentAt() {
        return sentAt;
    }

    public ZonedDateTime getSentAt(ZoneId zoneId) {
        return sentAt.withZoneSameInstant(zoneId);
    }

    public String getText() {
        return text;
    }

    public User getAuthor() {
        return author;
    }
}
