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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Chat {
    private final UUID uuid;
    private String title;
    private List<User> participants;
    private List<Message> messages;

    public Chat(List<User> participants) {
        this.uuid = UUID.randomUUID();
        title = String.format(" Chat with %s", participants
                .stream()
                .map(User::getName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("")
        );
        this.participants = participants;
        messages = new ArrayList<>();
    }

    public UUID getUUID() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public void addParticipant(User user) {
        this.participants.add(user);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void sendMessage(Message message) {
        this.messages.add(message);
    }
}
