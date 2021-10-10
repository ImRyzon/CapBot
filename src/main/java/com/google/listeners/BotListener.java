package com.google.listeners;

import com.google.CapBot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class BotListener extends ListenerAdapter {

    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {

        String messageSent = event.getMessage().getContentRaw();

        if (messageSent.equalsIgnoreCase(CapBot.prefix + "cap")) {
            event.getChannel().sendMessage("Stop the cap").queue();
        }

        if (messageSent.equalsIgnoreCase(CapBot.prefix + "wieny")) {
            event.getChannel().sendMessage("Wieny loves the AEK").queue();
        }

        if (messageSent.equalsIgnoreCase(CapBot.prefix + "yunhai")) {
            event.getChannel().sendMessage("Yunhai spent money on EA instead of PS5").queue();
        }

        if (messageSent.equalsIgnoreCase(CapBot.prefix + "announce")) {
            event.getChannel().sendMessage("Announcement").queue();
            event.getGuild().getTextChannelById("896430018199171072").sendMessage("Announcement").queue();
        }

        if (messageSent.equalsIgnoreCase(CapBot.prefix + "help")) {
            event.getChannel().sendMessage("```\nCommands:\n. cap\n. wieny\n. yunhai\n. announce\n```").queue();
        }

    }
}
