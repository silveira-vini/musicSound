package ribeiro.silveira.vinicius.musicSound.services;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ChatGptSearch {

    public static String getInformation(String texto) {
        OpenAiService service = new OpenAiService(System.getenv("OPENAI_APIKEY"));

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("tell me about this artist: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var answer = service.createCompletion(requisicao);
        return answer.getChoices().get(0).getText();

    }
}