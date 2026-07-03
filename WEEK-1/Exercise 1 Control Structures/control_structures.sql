SET SERVEROUTPUT ON;

DECLARE
    marks NUMBER := 78;
BEGIN
    -- IF-ELSIF-ELSE Control Structure
    IF marks >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade: A');
    ELSIF marks >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade: B');
    ELSIF marks >= 60 THEN
        DBMS_OUTPUT.PUT_LINE('Grade: C');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade: F');
    END IF;

    -- FOR LOOP
    DBMS_OUTPUT.PUT_LINE('Numbers from 1 to 5:');

    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;
END;
/