CREATE TABLE IF NOT EXISTS food_code (
    code VARCHAR(10) PRIMARY KEY,
    status VARCHAR(20)
);

INSERT INTO food_code(code, status) VALUES ('E100', 'HALAL') ON CONFLICT DO NOTHING;
INSERT INTO food_code(code, status) VALUES ('E200', 'HARAM') ON CONFLICT DO NOTHING;
INSERT INTO food_code(code, status) VALUES ('E300', 'MASHBUH') ON CONFLICT DO NOTHING;
