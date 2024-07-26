Feature: Book the room in ADACT hotel

Scenario: Guest able to book the room
Given Lunch the URL
When Provide the  valid "<username>" and "<password>"

Examples:
|   username     | password |
|chitradhinakaran|  F4R6YG  |

And Provide the guest details
And check guest able to book the room







