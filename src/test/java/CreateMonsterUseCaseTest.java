import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CreateMonsterUseCaseTest {

    @Test
    void shouldCreateMonster() {
        Monster monster = new Monster("1", "George");
        MonsterRepositoryMem monsterRepository = new MonsterRepositoryMem();
        CreateMonsterRequest createMonsterRequest = new CreateMonsterRequest(monster.getId(),monster.getName());

        CreateMonsterUseCase createMonsterUseCase = new CreateMonsterUseCase(monsterRepository);

        Assert.assertEquals(
                createMonsterUseCase.handle(createMonsterRequest),
                monster.getId()
        );
    }
}
