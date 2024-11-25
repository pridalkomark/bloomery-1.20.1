package pin.macaroon.bloomery.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;

public class CookCommand {
    private static String COMMANDNAME = "cook";
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register(CommandManager.literal(COMMANDNAME).executes(CookCommand::run));
    }

    private static int run(CommandContext<ServerCommandSource> ctx) throws CommandSyntaxException {
        ctx.getSource().sendFeedback(() -> Text.literal("TODO"), true);
        return 1;
    }
}
