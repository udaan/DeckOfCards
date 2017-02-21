Actors :
Card
Deck

Steps:
Create Deck
Load Deck with Cards
Shuffle Cards in the Deck
Get current state of Cards from the Deck

Scenario:
Given cards are present in the Deck when Deck is shuffled then shuffle cards in the Deck

Exception scenarios:
Given no cards are present in the Deck, when Deck is shuffled, then raise Exception InvalidCardException
Given Card is incorrect when Deck is shuffled then raise Exception InvalidCardException
