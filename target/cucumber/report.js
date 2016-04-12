$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("chooseSong.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user, when there is no current song in the university, I want to choose a new song so all other users can listen to it.",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "List all university\u0027s songs",
  "description": "",
  "id": ";list-all-university\u0027s-songs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "\"TCM\" isn\u0027t playing any song",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "have these songs on its store:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 11
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 12
    },
    {
      "cells": [
        "Joss",
        "Rulas",
        "300",
        "http://www.testing.com",
        "http://www.test.com"
      ],
      "line": 13
    },
    {
      "cells": [
        "Ready?",
        "Pep Sala",
        "300",
        "http://www.tet.com",
        "http://www.test.com"
      ],
      "line": 14
    },
    {
      "cells": [
        "Juliar",
        "Adele",
        "300",
        "http://www.ted.com",
        "http://www.test.com"
      ],
      "line": 15
    },
    {
      "cells": [
        "Join",
        "Apple",
        "300",
        "http://www.text.com",
        "http://www.test.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "Pelo",
        "Montana",
        "300",
        "http://www.temt.com",
        "http://www.test.com"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user searches for all songs of university \"TCM\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "will return next songs:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 25
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 26
    },
    {
      "cells": [
        "Joss",
        "Rulas",
        "300",
        "http://www.testing.com",
        "http://www.test.com"
      ],
      "line": 27
    },
    {
      "cells": [
        "Ready?",
        "Pep Sala",
        "300",
        "http://www.tet.com",
        "http://www.test.com"
      ],
      "line": 28
    },
    {
      "cells": [
        "Juliar",
        "Adele",
        "300",
        "http://www.ted.com",
        "http://www.test.com"
      ],
      "line": 29
    },
    {
      "cells": [
        "Join",
        "Apple",
        "300",
        "http://www.text.com",
        "http://www.test.com"
      ],
      "line": 30
    },
    {
      "cells": [
        "Pelo",
        "Montana",
        "300",
        "http://www.temt.com",
        "http://www.test.com"
      ],
      "line": 31
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 1
    }
  ],
  "location": "ChooseSongTests.isn_t_playing_any_song(String)"
});
formatter.result({
  "duration": 2966729361,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.have_these_songs_on_its_store(Song\u003e)"
});
formatter.result({
  "duration": 123483004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 43
    }
  ],
  "location": "ChooseSongTests.user_searches_for_all_songs_of_university(String)"
});
formatter.result({
  "duration": 19509155,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.will_return_next_songs(Song\u003e)"
});
formatter.result({
  "duration": 4619948,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Set current song",
  "description": "",
  "id": ";set-current-song",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "that \"TCM\" is not playing any song",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "has this list of songs:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 40
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 41
    },
    {
      "cells": [
        "Joss",
        "Rulas",
        "300",
        "http://www.testing.com",
        "http://www.test.com"
      ],
      "line": 42
    },
    {
      "cells": [
        "Ready?",
        "Pep Sala",
        "300",
        "http://www.tet.com",
        "http://www.test.com"
      ],
      "line": 43
    },
    {
      "cells": [
        "Juliar",
        "Adele",
        "300",
        "http://www.ted.com",
        "http://www.test.com"
      ],
      "line": 44
    },
    {
      "cells": [
        "Join",
        "Apple",
        "300",
        "http://www.text.com",
        "http://www.test.com"
      ],
      "line": 45
    },
    {
      "cells": [
        "Pelo",
        "Montana",
        "300",
        "http://www.temt.com",
        "http://www.test.com"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user selects:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 52
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 53
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "\"TCM\" must be playing:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 58
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 59
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 6
    }
  ],
  "location": "ChooseSongTests.that_is_not_playing_any_song(String)"
});
formatter.result({
  "duration": 49379944,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.has_list_of_songs(Song\u003e)"
});
formatter.result({
  "duration": 32151468,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.user_selects(Song\u003e)"
});
formatter.result({
  "duration": 23519269,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 1
    }
  ],
  "location": "ChooseSongTests.must_be_playing(String,Song\u003e)"
});
formatter.result({
  "duration": 20045007,
  "status": "passed"
});
formatter.uri("listenCurrentSong.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user, I want to listen to my university\u0027s current song, so I can discover awesome music.",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Users logged in a university, should be able to listen current song.",
  "description": "",
  "id": ";users-logged-in-a-university,-should-be-able-to-listen-current-song.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "\"TCM\" is playing:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 10
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user searches for university \"TCM\" current song",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "will return a song:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 18
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 1
    }
  ],
  "location": "ListenCurrentSongTests.is_playing(String,Song\u003e)"
});
formatter.result({
  "duration": 120710949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 30
    }
  ],
  "location": "ListenCurrentSongTests.user_searches_for_university_current_song(String)"
});
formatter.result({
  "duration": 13728554,
  "status": "passed"
});
formatter.match({
  "location": "ListenCurrentSongTests.will_return_a_song(Song\u003e)"
});
formatter.result({
  "duration": 1027225,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "If there is not a current song, user should receive a Not Found error.",
  "description": "",
  "id": ";if-there-is-not-a-current-song,-user-should-receive-a-not-found-error.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "\"TCM\" is not playing any song",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user searches for university\u0027s \"TCM\" current song",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Not Found error will be returned",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 1
    }
  ],
  "location": "ListenCurrentSongTests.is_not_playing_any_song(String)"
});
formatter.result({
  "duration": 37479612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 32
    }
  ],
  "location": "ListenCurrentSongTests.user_searches_for_university_s_current_song(String)"
});
formatter.result({
  "duration": 113984804,
  "status": "passed"
});
formatter.match({
  "location": "ListenCurrentSongTests.not_Found_error_will_be_returned()"
});
formatter.result({
  "duration": 133428,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "If there is no time left to the current song, user should receive a Not Found error.",
  "description": "",
  "id": ";if-there-is-no-time-left-to-the-current-song,-user-should-receive-a-not-found-error.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "\"TCM\" is playing a song:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 32
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "1",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 33
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "System waits for \"2\" seconds",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user searches for \"TCM\" song",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Not Found error will be shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 1
    }
  ],
  "location": "ListenCurrentSongTests.is_playing_a_song(String,Song\u003e)"
});
formatter.result({
  "duration": 80842461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "ListenCurrentSongTests.system_waits_for_seconds(int)"
});
formatter.result({
  "duration": 2000695366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TCM",
      "offset": 19
    }
  ],
  "location": "ListenCurrentSongTests.user_searches_for_song(String)"
});
formatter.result({
  "duration": 22914993,
  "status": "passed"
});
formatter.match({
  "location": "ListenCurrentSongTests.not_Found_error_will_be_shown()"
});
formatter.result({
  "duration": 3195432,
  "status": "passed"
});
});