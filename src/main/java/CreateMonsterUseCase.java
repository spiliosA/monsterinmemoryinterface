public class CreateMonsterUseCase {
    private MonsterRepositoryMem monsterRepository;

    public CreateMonsterUseCase(MonsterRepositoryMem monsterRepository) {

        this.monsterRepository = monsterRepository;
    }

    public String handle(CreateMonsterRequest createMonsterRequest) {
        Monster monster = new Monster(createMonsterRequest.getId(), createMonsterRequest.getName());

        monsterRepository.addMonster(monster);
        return monster.getId();
    }
}
