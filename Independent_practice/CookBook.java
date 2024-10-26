import java.util.*;

public class Cookbook {
    // Класс для хранения рецептов
    static class Recipe {
        String name;
        List<String> ingredients;
        String instructions;

        Recipe(String name, List<String> ingredients, String instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
        }
    }

    public static void main(String[] args) {
        // Создаем список рецептов
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Яичница", Arrays.asList("Яйцо", "Бекон"),
                "Разогрейте сковороду, добавьте бекон и обжарьте до золотистой корочки. Затем добавьте яйца и жарьте до готовности."));
        recipes.add(new Recipe("Рис с курицей", Arrays.asList("Рис", "Курица"),
                "Отварите рис. Курицу нарежьте и обжарьте на сковороде. Смешайте рис с курицей, добавьте специи по вкусу."));
        recipes.add(new Recipe("Салат из огурца и помидора", Arrays.asList("Огурцы", "Помидоры"),
                "Нарежьте огурцы и помидоры, добавьте соль, перец и оливковое масло."));
        recipes.add(new Recipe("Паста с мясом", Arrays.asList("Паста", "Фарш", "Помидоры"),
                "Отварите пасту, обжарьте фарш с помидорами до готовности и перемешайте с пастой."));
        recipes.add(new Recipe("Омлет", Arrays.asList("Яйцо", "Молоко", "Сыр"),
                "Взбейте яйца с молоком, добавьте натёртый сыр и готовьте на сковороде."));
        recipes.add(new Recipe("Курица в сливочном соусе", Arrays.asList("Курица", "Сливки", "Чеснок"),
                "Обжарьте курицу, добавьте сливки и чеснок, готовьте до загустения."));
        recipes.add(new Recipe("Блины", Arrays.asList("Мука", "Яйцо", "Молоко"),
                "Смешайте все ингредиенты, жарьте на сковороде до золотистой корочки с обеих сторон."));
        recipes.add(new Recipe("Тушеная капуста", Arrays.asList("Капуста", "Морковь", "Мясо"),
                "Обжарьте мясо, добавьте нашинкованную капусту и морковь, тушите до готовности."));
        recipes.add(new Recipe("Печеный картофель", Arrays.asList("Картофель", "Соль", "Масло"),
                "Запекайте картофель в духовке с солью и маслом до мягкости."));
        recipes.add(new Recipe("Суп из овощей", Arrays.asList("Морковь", "Картофель", "Лук"),
                "Отварите все овощи в воде до готовности, приправьте по вкусу."));

        // Добавьте сюда больше продуктов и рецептов по аналогии...

        System.out.println("Добро пожаловать в программу подбора рецептов!");

        // Запрашиваем у пользователя имеющиеся продукты
        System.out.print("Какие у вас есть продукты? (через запятую): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> availableIngredients = Arrays.asList(input.split(","));
        for (int i = 0; i < availableIngredients.size(); i++) {
            availableIngredients.set(i, availableIngredients.get(i).trim());
        }

        // Находим подходящие рецепты
        List<String> suggestedRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (availableIngredients.containsAll(recipe.ingredients)) {
                suggestedRecipes.add(recipe.name);
            }
        }

        if (suggestedRecipes.isEmpty()) {
            System.out.println("К сожалению, для ваших продуктов не найдено рецептов.");
        } else {
            System.out.println("Вы можете приготовить следующие блюда:");
            for (int i = 0; i < suggestedRecipes.size(); i++) {
                System.out.println((i + 1) + ". " + suggestedRecipes.get(i));
            }

            // Запрашиваем у пользователя выбор рецепта
            System.out.print("Введите номер блюда, которое хотите приготовить: ");
            int choice = scanner.nextInt() - 1;

            if (choice >= 0 && choice < suggestedRecipes.size()) {
                String selectedRecipeName = suggestedRecipes.get(choice);
                for (Recipe recipe : recipes) {
                    if (recipe.name.equals(selectedRecipeName)) {
                        System.out.println("\nРецепт для " + recipe.name + ":");
                        System.out.println(recipe.instructions);
                        break;
                    }
                }
            } else {
                System.out.println("Некорректный выбор.");
            }
        }

        scanner.close();
    }
}
